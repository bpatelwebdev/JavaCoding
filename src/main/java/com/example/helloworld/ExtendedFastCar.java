package com.example.helloworld;

import com.example.Car;
import com.example.CarInterface;

public class ExtendedFastCar extends Car {

    //This is Constructor give same name as a class
    public ExtendedFastCar(String company, String model, String color){
        super(company,model,color);
    }

    @Override
    public void accelerate() {
        if(isStarted) {
            speed += 20;
        }
    }





}