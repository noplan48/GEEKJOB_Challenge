/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author hirasawayuuichirou
 */
public class Timenow {
    public static void main(String[] args) {
        
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        System.out.print(sdf.format(d));
        
    }
       
}