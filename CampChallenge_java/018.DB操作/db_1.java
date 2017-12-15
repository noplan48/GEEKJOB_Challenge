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
public class db_1 {

    public static void main(String args[]) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db", "root", "root");
        
            statement = connection.prepareStatement("select * from user");
            //statement.setInt(1, 20);
       
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println("名前: " + resultSet.getString("name"));
            }
       
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e_sql) {
            System.out.print("接続時にエラーが発生しました:" + e_sql.toString());
        } catch (Exception e) {
            System.out.print("接続時にエラーが発生しました:" + e.toString());
        }
        
    }
}