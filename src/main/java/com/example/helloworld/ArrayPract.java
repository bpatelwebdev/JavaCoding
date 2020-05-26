package com.example.helloworld;

import com.example.Car;

public class ArrayPract {
    public static void main(String[] args) {

       /* int[] arr2 = {12,34,78,90,14};
        System.out.println(); //34,67,44,23,12,34,78
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
                arr3[i] = arr1[i];
         }
        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }

        */
        /*int[] arr1 = {34,67,44,23,34,56,22,33,45,23,67,44,22,33,88};
        int start =2,end=7; // {44,23,34,56,22,33}
        int lengh = end - start +1;
        int[] result = new int[lengh];
        int j=0;
        for(int i=start;i<=end;i++){
            result[j++] = arr1[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }*/


        String[] newArr = {"Hi this is 1","Hi this is 2","Hi this is 3","Hi this is 4","Hi this is 5","Hi this is 6s"};
        int[] intArr = {12,34,56,78,34,23,15,35};
        // 0=12,1=34
        int[][][] x = {{{1,2,3},{4,2,3},{2,7,8}},{{1,2,3},{4,2,3},{2,7,8}}};
        // x[0] = {1,2,3}
        // x[1] = {4,2,3}
        // x[0][0] = 1, x[0][2] = 3, x[2][1]=1
        // x[0]
      /*  for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);

        }

       */

        // For each loop
        for(int w:intArr){
            System.out.println();
        }
    }
}
