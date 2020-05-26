package com.example.helloworld;
import com.example.Car;

public class SafeCar extends Car {
    private boolean childLock;
    public SafeCar(String company, String model, String color) {
        super(company, model, color);
        childLock = false;
    }

    @Override
    public void applyBreak(){
        if(isStarted && speed>0){
            speed -=20;
        }
    }
    @Override
    public void startCar(){
        super.startCar();
        childLock=true;
    }
    @Override
    public void stopCar(){
        super.stopCar();
        childLock=false;
    }

    public boolean getChildLockStatus(){
        return childLock;
    }
}
