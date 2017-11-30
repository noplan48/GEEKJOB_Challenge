/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;
import java.util.ArrayList;

/**
 *
 * @author hirasawayuuichirou
 */
public class User extends Human{ //抽象クラス(Human)を継承して、Userクラスを作成
    
    public User() {
        myCards = new ArrayList<Integer>();
    }
    
    public void setCard(ArrayList<Integer> card) { //setCardをmyCardsに追加する。
        myCards.addAll(card);
    }
    
    public boolean checkSum() {
        if(open() <= 16) {
            return true;
        } else {
            return false;
        }
    }
    
    public int open() {
        int sum = 0;
        for(int c:myCards) {
            sum += c;
        }
        return sum;
    }
    
}
