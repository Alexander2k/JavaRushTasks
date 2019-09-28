package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    int count_passenger = 0;

    Plane(int count_passenger){
        this.count_passenger = count_passenger;

    }
    @Override
    public void fly() {

    }
}
