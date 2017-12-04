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
public class File2 {
    public static void main(String[] args){
        File seven = new File("test.txt");
            //絶対パスで指定してもOK
            //同じプロジェクト内にテキストファイルを置かないと、メディアオフライン状態になって、内容が表示されない。
        
        try{
            FileReader land = new FileReader(seven);
            BufferedReader collet = new BufferedReader(land);
                System.out.print(collet.readLine());
            collet.close();
            
        }catch (IOException e){
            System.out.print(e); 
        }   
} 
        }