package org.okten;

import lombok.Data;

@Data
public abstract class Animal implements Swimmable {

    protected String name;

    public abstract void makeSound();

    public void sleep() {
        System.out.println("Animal '" + name + "' is sleeping");
    }
}
