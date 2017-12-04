/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author hirasawayuuichirou
 */
public class Math1 {
    public static void main(String args[]){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        File dora = new File("testmath.txt");
        double nobi = 100d;
        double nobita = 500d;
        try{
            
            FileWriter emon = new FileWriter(dora);
            emon.write(sdf.format(d));
            System.out.println(sdf.format(d));
            emon.close();
            //改行にはBufferedWriterとnewLineを使う。
            
            FileWriter desu = new FileWriter(dora,true);
            BufferedWriter br = new BufferedWriter(desu);
            br.newLine();
            br.write("こんにちは！ 今回は数学の平方根・立方根について学習します。");
            br.newLine();
            br.write("これより、計算を開始します。");
            br.newLine();
            br.write("nobiの平方根は");
            br.newLine();
            br.write("「" + Math.sqrt(nobi) + "」です。");
            br.newLine();
            br.write("nobitaの立方根は");
            br.newLine();
            br.write("「" + Math.cbrt(nobita) + "」です。");
            br.newLine();
            br.write("これで計算を終わります。");
            br.close();
            
            FileReader athma = new FileReader(dora);
            BufferedReader anthem = new BufferedReader(athma);
            System.out.println(anthem.read());
            anthem.close();
            
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
