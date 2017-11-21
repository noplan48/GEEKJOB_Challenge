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

class player {
        //クラスの中にクラスは作れない！　が、分けて書くことはできる。
    //今回の課題はメソッドも2つ作成。
    
    public String adress = "";
    public int number = 0;
    //定義

    //今回の課題はメソッドも2つ作成。
    public  void setplayer(String n, int a) {
        
        this.adress = n;
        this.number = a;
    }
    //メソッドでadressとnumberを呼び出す。
    
    public void getplayer(PrintWriter pw){
    pw.print(adress);
    pw.print(number);
    }
    //adressとnumberを表示できるようにするメソッド。
    
    }
public class servlet9 extends HttpServlet {
    



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
            out.println("<title>Servlet servlet9</title>");            
            out.println("</head>");
            out.println("<body>");
            
            player human = new player();
            //humanという新しい変数を定義。playerというクラスを呼び出す。
            human.setplayer("秋葉原",48);
            //setplayerのメソッドを呼び出し、実数を与える。
            human.getplayer(out);
            //getplayerを呼び出し、ブラウザに表示d￥させるようにする。
            
            //間違いの記述。
            //String human1 = adress;
           // out.println(adress);
          //  out.println(number);
          
            //この部分の考え方は合っていた。
            //human.setplayer("秋葉原", 48);
            
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
