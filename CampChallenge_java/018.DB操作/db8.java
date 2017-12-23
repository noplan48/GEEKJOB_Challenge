/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author hirasawayuuichirou
 */
public class db8 extends HttpServlet {
    //jspファイルを作成し、それをこのサーブレットに飛ばす作業。を書く。
    
    //public　static void main(String args[]){
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            request.setCharacterEncoding("UTF-8");
            String p =request.getParameter("name");
           
           Connection c = null;
           PreparedStatement s = null;
           ResultSet r = null;
           
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            c = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","root","root");
            
            s = c.prepareStatement("SELECT * FROM profiles where name LIKE '%"+p+"%';");
            
            if(s.execute()) out.println("成功。次の処理に移ります。(^^)");
            
            r = s.executeQuery();
            while(r.next()) {
                out.println("profileID: " +r.getString("profileID"));
                out.println("名前: " +r.getString("name"));
                out.println("電話: " +r.getString("tel"));
                out.println("年齢: " +r.getString("age"));
                out.println("生年月日: " +r.getString("birthday"));
            }
            c.close();
            s.close();
            r.close();
            
        }catch(SQLException e_sql){
            System.out.print("接続時にエラーが発生しました:" + e_sql.toString());
        }catch(Exception e){
            System.out.print("接続時にエラーが発生しました:" + e.toString());
                
        
            
        }
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
