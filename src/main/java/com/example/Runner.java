package com.example;

import com.example.helloworld.ExtendedFastCar;
import com.example.helloworld.FastCar;
import com.example.helloworld.SafeCar;

public class Runner {
    public static void main(String[] args) {
        Car c1 = new Car("tata","manza");
        Car c2 = new Car("hundai","i20");
        FastCar c3 = new FastCar("maruti","zen","red");

        ExtendedFastCar c4 = new ExtendedFastCar("tesla","R","red");

        SafeCar c5 = new SafeCar("Ford","2020","Silver");

        c5.startCar();
        c5.accelerate();
        c5.accelerate();
        c5.accelerate();
        c5.applyBreak();
        System.out.println(c5.getSpeed());
        c4.startCar();
        c4.accelerate();
        c4.applyBreak();
        System.out.println(c4.getSpeed());
        c1.startCar();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c2.startCar();
        c2.accelerate();
        System.out.println(c1.getModel());
        System.out.println();
        System.out.println(c2.getSpeed());

        // this object of SafeCar, all enhancement + new features will be availble in this object
        SafeCar mySafeCar = new SafeCar("","","");
        // run time polymorphism
// this object is of car class but constructed by SafeCar so ne enhancemnts will be available but no new features will be there.
// example like applyBreak will reduced speed by 20 as SafeCar.But, getChildLock status will not availble for this car object.
        Car myNewSafeCar = new SafeCar("","","");
       // mySafeCar.getChildLockStatus();
        CarInterface c33 = new SafeCar("", "", "") ;
        /// overriding is runtime poly & overloading is compile time poly
        myNewSafeCar.applyBreak();








    }
}
