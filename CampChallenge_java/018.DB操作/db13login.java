/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db8;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author hirasawayuuichirou
 */
public class db13login extends HttpServlet {


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            request.setCharacterEncoding("UTF-8");
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet db13login</title>");            
            out.println("</head>");
            out.println("<body>");
            
            request.setCharacterEncoding("UTF-8");
            
            String id =request.getParameter("ID");
            String pass =request.getParameter("password");
            
            Connection c = null;
            PreparedStatement s = null;
            ResultSet r = null;
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            c = DriverManager.getConnection("jdbc:mysql://localhost:8889/USER","root","root");
            s = c.prepareStatement("SELECT * FROM user1 WHERE ID = ? AND password = ?");
            s.setString(1,id);
            s.setString(2,pass);
            r = s.executeQuery();
            if(r.next()){
                out.println("成功。次の処理に移ります。（＾＾）");
            s = c.prepareStatement("SELECT * FROM user1");
            r = s.executeQuery();
            
            RequestDispatcher rd = request.getRequestDispatcher("/db13login2.jsp");
            rd.forward(request,response);
            
            }else{
                RequestDispatcher rd1 = request.getRequestDispatcher("/db13login.jsp");
                rd1.forward(request, response);
            }
        
}catch(SQLException e_sql){
            System.out.print("接続にエラーが発生しました:" +e_sql.toString());
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
