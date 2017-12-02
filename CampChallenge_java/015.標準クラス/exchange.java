/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

/**
 *
 * @author hirasawayuuichirou
 */
public class exchange {
    public static void main(String[] args){
        String exchange  = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";  //変数を使って置き換える。

            String str = exchange.replace("I","い");
        
                System.out.print(str.replace("U","う"));
                //System.out.print(exchange.replace("I","い").replace("U", "う"));
           
    }
    
}
