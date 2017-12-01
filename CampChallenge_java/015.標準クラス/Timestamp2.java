/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author hirasawayuuichirou
 */
public class Timestamp2 {
    public static void main(String[] args){
        
    Calendar c = Calendar.getInstance();
    c.set(2015,0,1,0,0,0);
    
    Calendar ca = Calendar.getInstance();
    ca.set(2015,11,31,23,59,59);
    
//    t(c('2015-0-1 0:0:0) - ca(2015-11-31 23:59:59'));
    long k = c.getTime().getTime();
    long l = ca.getTime().getTime();
    
    System.out.println(l-k);
    




    //SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:sss");
    //System.out.println(c.getTime().getTime());
    //System.out.print(ca.getTime().getTime());
        
        
    }
}
