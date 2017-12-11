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
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author hirasawayuuichirou
 */
public class session2 extends HttpServlet {

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
            String name =request.getParameter("myname");
            String sex =request.getParameter("sex");
            String hobby =request.getParameter("hobby");

            if(name ==null){
                name = "";
            }
            if(sex ==null){
                sex = "";
            }
            if(hobby ==null){
                hobby = "";
            }

            HttpSession hs  = request.getSession();
            hs.setAttribute("name",name);
            hs.setAttribute("sex",sex);
            hs.setAttribute("hobby",hobby);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet session2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=\"./session2\" method=\"post\">");   //htmlの記述方法。
            
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String s =sdf.format(d);
            out.println(s+"<br />");
            out.println("名前：<input type=\"text\" name=\"myname\" value=\""+hs.getAttribute("name")+"\" /><br />");
            
            out.println("性別：<input type=\"text\" name=\"sex\" value=\""+hs.getAttribute("sex")+"\" /><br />");
            out.println("趣味：<input type=\"text\" name=\"hobby\" value=\""+hs.getAttribute("hobby")+"\" /><br />");
            out.println("送信：<input type=\"submit\" name=\"submit\" /><br />");
            
            out.println("</form>");
            
            
            out.println("</body>");
            out.println("</html>");
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
