package com.example;

public class Calculator {
    private static int memory;
    String company;


    public Calculator(String company){
        this.company = company;
    }


    // pure method... not depend on any attribute on class neither affect on any
    public static int performSum(int a,int b){
        return a+b;
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
    public static int getStatMemory(){
        // not allowed
        return memory;
    }

}
