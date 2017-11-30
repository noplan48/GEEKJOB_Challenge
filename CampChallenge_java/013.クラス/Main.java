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

public class Main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        User user = new User();
        
        // 山札からカードを配る
        // ディーラーに配る
        System.out.println("----------------ディーラー----------------");
        dealer.setCard(dealer.deal());      
        
        // ユーザーに配る
        System.out.println("----------------ユーザー------------------");
        user.setCard(dealer.deal());
        
        System.out.println("=============デュエル開始！================");
        while(dealer.checkSum() && user.checkSum()) {
            System.out.print("ディーラーに");
            dealer.setCard(dealer.hit());
            System.out.print("ユーザーに");
            user.setCard(dealer.hit());
        }
        
        System.out.println("=============カードオープン！==============");
        System.out.println("ディーラー："+dealer.open());
        System.out.println("ユーザー　："+user.open());
        
        
    }
}