package org.okten;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Nyaw-nyaw-nyaw");
    }

    @Override
    public void swim() {
        System.out.println("Cat is swimming...");
    }
}
