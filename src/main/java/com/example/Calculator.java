package com.example;

public class Calculator {
    private int memory;
    static String company;


    public Calculator(String company){
        this.company = company;
        memory=0;
    }


    // pure method... not depend on any attribute on class neither affect on any
    public double performSum(double a,double b){
        return a+b;
    }

    public double performSum(double a,double b,double c){
        return a+b+c;
    }


    public int performDiff(int a,int b){
        return a-b;
    }
    public int performMul(int a,int b){
        return a*b;
    }
    public int performDiv(int a,int b){
        return a/b;
    }
    public void memoryPlus(int num1){
        memory+=num1;
    }
    public String getCompany(){
        return company;
    }
    public int getMemory(){
        return memory;
    }
   // public static int getStatMemory(){
        // not allowed
        //return memory;
    //}

}
