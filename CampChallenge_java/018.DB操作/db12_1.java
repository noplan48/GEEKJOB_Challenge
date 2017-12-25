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


/**
 *
 * @author hirasawayuuichirou
 */
public class db12_1 extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet db12_1</title>");            
            out.println("</head>");
            out.println("<body>");
            
            request.setCharacterEncoding("UTF-8");
            
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            String brt = request.getParameter("birthday");
            
            Connection c = null;
            PreparedStatement s = null;
            ResultSet r = null;
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            c = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","root","root");
            s = c.prepareStatement("SELECT * FROM profiles WHERE name LIKE '%"+name+"%' AND age LIKE '%"+age+"%' AND birthday LIKE '%"+brt+"%';");
            //s = c.prepareStatement("SELECT * FROM profiles WHERE age LIKE '%+age+%';");
//            s.setString(1,name);
//            s.setInt(2,Integer.parseInt(age));
//            s.setString(3,brt);
            
            if(s.execute())
                out.println("成功。次の処理に移ります。（＾＾）");
            
            //s = c.prepareStatement("SELECT * FROM profiles");
            r = s.executeQuery();
            
            out.println("<table border =\"1\">");
            out.println("<tr>");
            out.println("<th>ID</th><th>名前</th><th>電話</th><th>年齢</th><th>生年月日</th>");
            out.println("</tr>");
            
            while(r.next()){
                out.println("<tr>");
                out.println("<td>" + r.getString("profileID") +"</td>");
                out.println("<td>" + r.getString("name") +"</td>");
                out.println("<td>" + r.getString("tel") +"</td>");
                out.println("<td>" + r.getString("age") +"</td>");
                out.println("<td>" + r.getString("birthday") +"</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
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
