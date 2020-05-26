package com.example.helloworld;

public class StringPract {


    public static void main(String[] args) {
        //length
        //toLower
        //toUpper
        //charAt
        //contains
        //startsWith
        //endsWith
        //indexof
        //substring
        //split
        //replace
        //replaceAll Regular Expression//
        // equals
        //equalIgnoreCase
        //compareTo
        //trim

        String bigStr  = "   Hi   My Name   is   Bhavik     I     Stay in     USA   but      I Love      Indian ";

        while(bigStr.contains("  ")) {
            bigStr = bigStr.replace("  ", " ");
        }
        System.out.println(bigStr.trim());



        System.out.println(bigStr.replace(" ",""));

        String name  ="KIRTESHWani";// KIRTESH IRTESHK RTESHKI TESHKIR ESHKIRT SHKIRTE HKIRTES

        for(int i=0;i<name.length();i++){
            System.out.println(name);
            char firstChar =  name.charAt(0);
            String tail = name.substring(1);
            name= tail+firstChar;

        }

    }

}
