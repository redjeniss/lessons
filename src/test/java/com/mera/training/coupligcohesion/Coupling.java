package com.mera.training.coupligcohesion;

public class Coupling {

    class Driver {
        void drive(){
            System.out.println(new Car().engine);
        }
    }

    class Car {
        String engine;
        void drive(){};
    }


}
