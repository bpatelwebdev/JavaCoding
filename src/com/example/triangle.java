package com.example;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        int a = 90;
        int b = -90;
        int c = 180;
        int sum;
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter angleA: ");
        a = scanner.nextInt();
        System.out.println("Please enter angleB: ");
        b = scanner.nextInt();
        System.out.println("Please enter angleC: ");
        c = scanner.nextInt();
       */
        if(a+b+c==180 && a>0 && b>0 && c>0){
           if(a==b && c==a){
               System.out.println("eq");
           }else{
               if(a==90||b==90|c==90){
                   System.out.println("rt");
               }else{
                   if(a==b||b==c||c==a){
                       System.out.println("iso");
                   }else{
                       System.out.println("scelene");
                   }
               }
           }

        }else{
            System.out.println("not a triangle");
        }






        /* sum = A+B+C;
        System.out.println(sum);
        if ((A == B && B == C ) || (A+B==90)){
            System.out.println("Acute Triangle");
        }else{
            System.out.println("Obtuse Triangle");
        }

        */

    }
}
