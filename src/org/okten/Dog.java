package org.okten;

public class Dog extends Animal implements Sportable {

    @Override
    public void makeSound() {
        System.out.println("Gav-gav-gav");
    }

    public void takeBone() {
        System.out.println("Dog '" + name + "' is taking bone...");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving...");
        makeSound();
        System.out.println("Dog is moving...");
    }

    @Override
    public void swim() {
        System.out.println("Dig is swimming...");
    }
}
