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
public class db4 {
    public static void main(String args[]){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","root","root");
            
            statement = connection.prepareStatement("SELECT * FROM profiles where profileID =1");
            
            System.out.println("成功。次の処理に移ります。");
            
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                System.out.println("profileID: " +resultSet.getString("profileID"));
                System.out.println("名前: " + resultSet.getString("name"));
               System.out.println("電話: " + resultSet.getString("tel"));
               System.out.println("年齢: " + resultSet.getString("age"));
               System.out.println("生年月日: " + resultSet.getString("birthday"));
            }
        
                connection.close();
                statement.close();
                resultSet.close();
    }catch(SQLException e_sql){
    System.out.print("接続時にエラーが発生しました:" + e_sql.toString());
        }catch(Exception e){
    System.out.print("接続時にエラーが発生しました:" + e.toString());
    }
    }
}


