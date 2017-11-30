/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author hirasawayuuichirou
 */public class Dealer extends Human { //抽象クラス(Human)を継承して、Dealerクラスを作成
    String[] mark = {"ハート","ダイヤ","スペード","クローバー"};
    ArrayList<Integer> cards = new ArrayList<Integer>(); //cardsというArrayListの変数を用意し、cardsに全てのトランプを持たせる。
    
    public Dealer(){ // コンストラクタ処理(初期化処理)
        for(int i=1; i<=13; i++){       //add.(1)とかで追加する方法もある。
            for(int j=1; j<=4; j++){        //iは1~13までの数字、jはそれが4種類あるということ。
                if(i>=10){
                    cards.add(10); //10以上の時は全て10とみなす書き方
                } else if(i>0){
                    
                    cards.add(i); //それ以外はその数字の値。（1,11は1で固定）
                }
            }
        }
        myCards = new ArrayList<Integer>(); //Dealerクラスに置くことで、配ったカードを受け取る役割を果たす。
    }
 
   
    public  ArrayList<Integer> deal(){ //Integerは、変換。intやStringに変換できる。

        ArrayList<Integer> dealcard = new ArrayList<Integer>();
        // dealcardという変数を宣言。
        Random random = new Random();     //randomクラスを作り、変数をrandomと置く。  
        
        int n = random.nextInt(cards.size());  //nextIntはaddと同じようなもの。int型を呼び出す際に使う。
                                               //cards.size()は要素数の取得。ここでカードの数52を代入してしまうと、カードが減った時の処理ができなくなる。
                                               //()のままで良いのは、メソッドに変数を定義できないから。
        
        dealcard.add(cards.get(n));   //ここでは、dealcardに要素を取得。カードから一枚引くという記述。
        Integer gettingcard1 = cards.remove(n);                                     //上のままだと、カードを引いた状態。重複している。束から引かれたカードを取り除く処理を書く。
        System.out.println(mark[n%4] + "の" + gettingcard1 + "を配る。");  //0が入った時、0と言う数字が出ない様にする表記。
                                                                    //%も/もあまりの計算はできるが、画面に表示させるかどうかの違い。
        int m = random.nextInt(cards.size());   //2枚のカードをArrayListにして返却。つまり、同じ処理をもう一度繰り返す。
        dealcard.add(cards.get(m));
        Integer gettingCard = cards.remove(m);
        System.out.println(mark[m%4] + "の" + gettingCard + "を配る。");
        
        return dealcard;   //dealのArrayListに戻す処理。
    }
 
    
    public ArrayList<Integer> hit(){  //同様に、hitという公開メソッドを用意。cardsからランダムで1枚のカードをArrayListにして返却。
        ArrayList<Integer> hitcard = new ArrayList<Integer>();
        Random random = new Random();       
        
        int l = random.nextInt(cards.size()); 
        hitcard.add(cards.get(l));   
        Integer gettingcard2 = cards.remove(l);  //Integer 変数をリムーブ。
        System.out.println(mark[l%4] + "の" + gettingcard2 + "を配る。");  //Integer　変数がそのまま入るので、値に変化なし。
        
        return hitcard;
    }   
    
    @Override
    public void setCard(ArrayList<Integer> card) { //setCardをmyCardsに追加する。
        myCards.addAll(card); //setCardのcardを入れる。cardをmyCard(手札）に追加する。
    }
    @Override
    public boolean checkSum() {
        if(open() <= 17) {     //メソッドの中にメソッドがあるから()の中は空欄で良い。
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int open() {     //myCardsにint c を代入する記述。:コロンは左辺に右辺を代入する記述。
        int sum = 0;
        for(int c:myCards) {      //合計値を算出する処理。
            sum += c;
        }
        return sum;
    }
}
