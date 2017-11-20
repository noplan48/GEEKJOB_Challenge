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
public class servlet8 extends HttpServlet {
    private String[][] getProfile(){
        //二次元配列 getProfileという引数を置く。
        String[] profile = {"99999","平澤","1990/4/30",null};
        String[] profiles = {"88888","滝口","1994/9/20","習志野市"};
        String[] profile1 = {"77777","橋本","1999/2/3","福岡市"};
        String[][] profile2 ={profile,profiles,profile1};
        
        //二次元配列の変数をprofile2にまとめることで、楽な書き方ができる。
        return profile2;
        //リターンで、プロフィールを戻す。
    }

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
            out.println("<title>Servlet servlet8</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String[][] prof=getProfile();
            //profという変数を宣言する。getProfileに置き換えられるように。
            Integer limit =2;
            // IntegerはStringと似た型。
            for(int i = 0; i < limit; i++) {
                //int iを宣言。iはlimitに来た時、ループを抜ける。iはprofile列の数。
                for(int j=0;j<prof[i].length;j++) {
                    //int jを宣言。jはprofの配列の要素数を指す。
                if ( prof[i][j] == null) {
                continue;
               //profがnullに来た時だけ、表示しない。
                
                }else{
                    //上記の条件ではないとき。以下のことを処理。
                switch(j) {
                    //case1から順にチェックしていく。
                    case 1:
                        out.println("私の名前は"+prof[i][j]+"です。<br />");
                        break;
                    case 2:
                        out.println("生年月日は"+prof[i][j]+"です。<br />");
                        break;
                    case 3:
                        out.println("住所は"+prof[i][j]+"です。<br />");
                        break;
                
            }
                }

            }
            }
                
            
            
                
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
