/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author hirasawayuuichirou
 */
public class Timestamp1 {
    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();
        c.set(2016,10,4,10,0,0);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        System.out.print(sdf.format(c.getTime()));
        
    }
        
        
}
   

    

