package org.okten.main;

import org.okten.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void swim() {

            }

            @Override
            public void makeSound() {
                System.out.println("asdasdasd");
            }
        }; // initialization of abstract classes is not recommended
        animal.setName("Pig");
        System.out.println(animal);

        Cat cat = new Cat();
        cat.setName("Vasya_1");
        cat.makeSound();
        cat.sleep();

        Dog dog = new Dog();
        dog.setName("Hasky_2");
        dog.makeSound();
        dog.sleep();
        dog.takeBone();

        Shpiz shpiz = new Shpiz();
        shpiz.setName("Kartoshka_1");
        shpiz.makeSound();
        shpiz.sleep();
        shpiz.takeBone();

        Vehicle vehicle = new Vehicle();
        vehicle.setContent("tools for camping");

        ArrayList<Movable> movables = new ArrayList<>();
        movables.add(vehicle);
        movables.add(dog);
        movables.add(shpiz);

        for (Movable movable : movables) {
            movable.move();
        }
    }

    public void simulateAnimal(Animal animal) {
        if (animal instanceof Cat) {
            System.out.println("Simulating cat...");
        } else {
            System.out.println("simulating other animal...");
        }
    }
}
