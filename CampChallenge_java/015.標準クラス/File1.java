/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;
import java.io.*;
/**
 *
 * @author hirasawayuuichirou
 */
public class File1 {
    public static void main(String[] args){
        File dance = new File("test.txt");
        
        try {
            FileWriter philosophy = new FileWriter(dance);

            philosophy.write("こんにちは！平澤裕一郎です。趣味は映画鑑賞です。");

            philosophy.close();
        } catch(IOException e) {
            System.out.print(e);
        }
    }
}
