package com.example.helloworld;

import java.util.Scanner;

public class Homework {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for(int i = limit; i>=0; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j=limit;j>i;j--){
                System.out.print("  ");
            }

            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

