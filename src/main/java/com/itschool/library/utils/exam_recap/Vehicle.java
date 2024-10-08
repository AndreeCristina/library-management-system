package com.itschool.library.utils.exam_recap;

/* Vehicle Movement (Inheritance and Polymorphism)
 * Create a base class Vehicle with a method move().
 * Create subclasses Car and Bike that override the move() method.
 * Demonstrate polymorphism by calling move() on different vehicles.
 */

public class Vehicle {

    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
        ;
    }
}

class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving");
        ;
    }
}

class MainMethod {

    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bike()};

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}