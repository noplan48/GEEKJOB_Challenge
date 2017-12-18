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
public class db2 {
    public static void main(String args[]) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db", "root", "root");
        
            statement = connection.prepareStatement("INSERT INTO profiles (profileID,name,tel,age,birthday) values (6,'田中 太郎','090-9999-9999',35,'1982-05-05');");
            
            if(statement.executeUpdate() == 0) {
                System.out.println("失敗");
            } else {
                System.out.println("成功.次の処理に移ります");
                statement = connection.prepareStatement("SELECT distinct* FROM profiles;");
                resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    System.out.println("名前: " + resultSet.getString("name"));
                }
            }
            connection.close();
            statement.close();
//            resultSet.close();
        } catch (SQLException e_sql) {
            System.out.print("接続時にエラーが発生しました:" + e_sql.toString());
        } catch (Exception e) {
            System.out.print("接続時にエラーが発生しました:" + e.toString());
        }
    }
}