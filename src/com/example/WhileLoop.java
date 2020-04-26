package com.example;

public class WhileLoop {
    public static void main(String[] args) {
        // deposited 1000$  rate 7.21% P.A. in how many years our money get double
        // simple interest?
        // compound interest

        double prin = 1000;
        double amt = prin;
        double rate = 7.21;
        double interest;
        int year = 1;
        while (amt<prin*2){
            interest = amt*rate/100;
            amt += interest;
            year++;
        }
        System.out.print(year);



        /*for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }*/
    }
}
