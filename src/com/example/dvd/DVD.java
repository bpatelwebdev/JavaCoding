package com.example.dvd;

import java.util.Scanner;

public class DVD {
    DVD[] dvdCollection = new DVD[15];

    public static void main(String[] args) {
        int x =10;
        boolean b =true;
        /// + - * / % ++ -- *= *= /= %=
        int y = --x;
        y= y+10;
        y+=10;
        y*=5;
        y%=10;
        System.out.println(y);
        System.out.println(x);
        /// == > < >= <= !=
        /// && || !
        int age;
        int gender;
        /// BPDMSA

        //// find the type of triangle based on there 3 angles

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter age");
        age = scanner.nextInt();
        System.out.println("Please enter gender");
        gender = scanner.nextInt();
        if((gender==1&&age>=21)||(gender==0&&age>=18)){
            System.out.println("candidate is eligible");
        }else{
            System.out.println("candidate is not eligible");
        }


        }
}

////// package name should be small case... avoid using numbers, special char
////// Class name should beStart With Capital after that Camel case
///// method & variable should start with small case
///// constants / enums should be all Capital

//// primitive
