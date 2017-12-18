/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author hirasawayuuichirou
 */
public class db5 {
    public static void main(String args[]){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultset = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","root","root");
            
            statement = connection.prepareStatement("SELECT * FROM profiles where name LIKE '%茂%';");
            System.out.println("成功。次の処理に移ります。");
            
            resultset = statement.executeQuery();
            while(resultset.next()){
                System.out.println("profileID: " + resultset.getString("profileID")); 
                System.out.println("名前: " + resultset.getString("name"));
                System.out.println("電話: " + resultset.getString("tel"));
                System.out.println("年齢: " + resultset.getString("age"));
                System.out.println("生年月日: " + resultset.getString("birthday"));
            }
            
            connection.close();
            statement.close();
            resultset.close();
        }catch(SQLException e_sql){
            System.out.print("接続時にエラー発生しました:" + e_sql.toString());
        }catch(Exception e){
            System.out.print("接続時にエラーが発生しました:" + e.toString());
        }
    }
}
