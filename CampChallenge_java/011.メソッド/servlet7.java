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
public class servlet7 extends HttpServlet {
    private String[] getProfile(String id){
        String[][] profiles = {
            {"99999","平澤","1990/4/30",null},
            {"88888","滝口","1994/9/20","習志野市"},
            {"77777","橋本","1999/2/3","福岡市"}
        };
        String[] profile = {"", "", "", ""}; 
        for(int i = 0; i < 3; i++) {
            if(id.equals(profiles[i][0])) {
                profile = profiles[i];
                break;
            }
        }
        
        return profile;
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
            out.println("<title>Servlet servlet7</title>");            
            out.println("</head>");
            out.println("<body>");
            for(int i = 77777; i < 100000; i+=11111) {
            String[] profile;            
            profile = getProfile(Integer.toString(i));
//            if(profile[3]==null) {
//             continue;
//            }
            
            for(int j=0;j<profile.length;j++) {
                if (j == 0 || profile[j] == null) {
                    continue;
                }
                
                switch(j) {
                    case 1:
                        out.println("私の名前は"+profile[j]+"です。<br />");
                        break;
                    case 2:
                        out.println("生年月日は"+profile[j]+"です。<br />");
                        break;
                    case 3:
                        out.println("住所は"+profile[j]+"です。<br />");
                        break;
                }
            }

            }
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
