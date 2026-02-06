package org.example.sandbox.inheritance;

public class Car extends Vehicle{

    public Car(){

    }

    @Override
    public void load() {
        System.out.println("Loading car stuff");
    }

    @Override
    public void transport() {
        System.out.println("Transporting car stuff");
    }

    @Override
    public void unload(){
        System.out.println("Unloading car stuff");
    }
}
