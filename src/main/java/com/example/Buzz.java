package com.example;

public class Buzz {

    public static void main(String[] arg){
        for (int i=1;i<=100;i++) {
            if ((i % 3 == 0) || (i % 5 == 0)){

                if((i % 3 == 0) && (i % 5 == 0)){
                    System.out.println("fizz Buzz");
                }else {
                    if (i % 3 == 0) {
                        System.out.println("fizz");
                    } else {
                        System.out.println("Buzz");
                    }
                }
            }else{
                    System.out.println(i);
                }
            }

        for(int j=1;j<=20;j++){
        }
    }
    }

