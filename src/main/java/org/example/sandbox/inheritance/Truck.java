package org.example.sandbox.inheritance;

public class Truck extends Vehicle{

    public Truck(){

    }

    @Override
    public void load() {
        System.out.println("Loading truck stuff");
    }

    @Override
    public void transport() {

    }
}
