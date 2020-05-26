package com.example;

public class CalcRunner {
    public static void main(String[] args) {
        Calculator c1 = new Calculator("Casio");
        Calculator c2 = new Calculator("sharp");
        c1.memoryPlus(10);
        c1.memoryPlus(2);
        c1.memoryPlus(5);

        c2.memoryPlus(3);
        c2.memoryPlus(5);
        c2.memoryPlus(2);
        c1.getMemory();
        // overloading method .... Polymorphism
        c1.performSum(12,23,12);


        //Calculator.getStatMemory();

        System.out.println(c1.getCompany());
        System.out.println(c2.getCompany());

    }
}
