package com.example;

public class Runner {
    public static void main(String[] args) {
        Car c1 = new Car("tata","manza");
        Car c2 = new Car("hundai","i20");
        Car c3 = new Car("maruti","zen","red");

        c1.startCar();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c2.startCar();
        c2.accelerate();
        System.out.println(c1.getModel());
        System.out.println();
        System.out.println(c2.getSpeed());
    }
}
