package com.example;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        ////// write all even & odd numbers between 1 to 100
        //int y=1;
        for(int y=1;y<=100;y++){
            if(y%2==0) {
                System.out.println("Odd" + y);
            }
            else{
                System.out.println("Even" + y);
            }
        }

        /// write table of a given number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter table number: ");
        int j = scanner.nextInt();
       for(int i =0;i<=10;i++){

           int table = j*i;
           System.out.println(j+"*"+i+ '='+ table);

           }
       for(int i=j;i<=j*10;i+=j){
            System.out.println(i);
       }









    }

}


