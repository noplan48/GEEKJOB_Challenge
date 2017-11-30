/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.util.ArrayList; //ArrayListをインポート
        
/**
 *
 * @author hirasawayuuichirou
 */
abstract class Human{
    public abstract int open(); //openというabstractな公開メソッド
    public abstract void setCard(ArrayList<Integer> card);
    //setCardというArrayListを引数とした、abstractな公開メソッド
    public abstract boolean checkSum(); //checkSumというabstractな公開メソッド
    protected ArrayList<Integer> myCards; //myCardsというArrayListの変数
}


