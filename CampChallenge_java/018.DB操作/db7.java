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
public class db7 {
    public static void main(String args[]){
        Connection c = null;
        PreparedStatement s = null;
        ResultSet r = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","root","root");
            s = c.prepareStatement("update profiles set name ='松岡修造',age=48, birthday = '1967-11-06' where profileID =1");
            s.execute();
           
            System.out.println("成功。次の処理に移ります^^");
            
            s = c.prepareStatement("SELECT distinct * FROM profiles;");
            s = c.prepareStatement("SELECT distinct * FROM profiles ORDER BY 1 ASC");
            r = s.executeQuery();
            while(r.next()){
                System.out.println("ID: " + r.getString("profileID"));
                System.out.println("名前: " + r.getString("name"));
                System.out.println("電話: " + r.getString("tel"));
                System.out.println("年齢: " + r.getString("age"));
                System.out.println("生年月日: " + r.getString("birthday"));
                
            }
            c.close();
            s.close();
            r.close();
        }catch (SQLException e_sql){
            System.out.print("接続時にエラーが発生しました:" + e_sql.toString());
        }catch(Exception e){
            System.out.print("接続時にエラーが発生しました:" + e.toString());
              
            }
        }
    }
    

