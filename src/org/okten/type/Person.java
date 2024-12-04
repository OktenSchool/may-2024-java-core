package org.okten.type;

public class Person {

    private String name;

    private int age;

    public Person(String firstName, String lastName, int age) {
        name = firstName + " " + lastName;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{ name=" + name + ", age=" + age + " }";
    }
}
