package com.example;

public class SwitchCase {
    public static void main(String[] args) {
        int x=20;
        switch (x){
            case 10:
                System.out.println("i am in 10");

            case 20:
                System.out.println("i am in 20");
                //break;
            case 30:
                System.out.println("i am in 30");
                break;
            default:
                System.out.println("else case");

        }
    }
}
