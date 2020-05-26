package com.example.helloworld;

import com.example.CarInterface;

public class FastCar implements CarInterface {
    private int speed;
    private boolean started;
    private String color;
    private String make;
    private String model;
    //This is Constructor give same name as a class
    public FastCar(String make,String model,String color){
        this.make = make;
        this.model = model;
        this.color = color;
        started = false;
        speed = 0;
    }

    public int getSpeed(){
        return speed;
    }

    public void startCar(){
        started = true;
        speed = 0;
    }

    public void stopCar(){
        started = false;
        speed = 0;
    }


    public void accelerate() {
        if(started) {
            speed += 20;
        }
    }


    public void applyBreak() {
        if(started && speed >0){
            speed -= 10;
        }
    }




}