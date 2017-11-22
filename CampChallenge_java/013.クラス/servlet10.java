/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hirasawayuuichirou
 */
public class servlet10 extends HttpServlet {

class player {
        
    public String adress = "";
    public int number = 0;
   
    public  void setplayer(String n, int a) {
        
        this.adress = n;
        this.number = a;
    }
    
    public void getplayer(PrintWriter pw){
    pw.print(adress);
    pw.print(number);
    }
}

class host extends player{
    //メソッドを書いて、代入する。
    public  void players(String n, int a) {
      this.adress = "";
      this.number = 0;
}
    public void getplayers(PrintWriter pw){
    pw.print(adress);
    pw.print(number);
    }
    
}
    
    //今回の課題は、Stringだったらnull、intだったら0にする。それが、変数の中身をクリアするということ。

 
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
            out.println("<title>Servlet servlet10</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            host kick = new host();
            kick.players(null,0);
            kick.getplayers(out);
            
            out.println("</body>");
            out.println("</ html>");
           
            
            
            
    
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
    //@Override
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
    //@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    //@Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}




