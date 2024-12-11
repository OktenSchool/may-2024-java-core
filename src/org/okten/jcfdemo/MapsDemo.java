package org.okten.jcfdemo;

import java.util.*;

public class MapsDemo {

    // find by O(1)
    // max int = Integer.MAX_VALUE = 2^31 (~2 billions)

    // hashCode -> equals
    // initial capacity = 16
    // put(A, B) -> A.hashCode() % 16 = 0-15
    // get(A) -> A.hashCode() % 16 = 0-15

    public static void main(String[] args) {
        Map<String, Person> persons = new HashMap<>(10); // loadFactor = 0.75 -> maxCapacity = 7
        // "John".hashCode() = 92348793284
        persons.put("John", new Person("John", 15));
        persons.put("Mike", new Person("Mike", 23));
        persons.put("Bob", new Person("Bob", 42));
        persons.put("Alice", new Person("Alice", 27));
        System.out.println(persons);

        System.out.println(persons.get("Mike")); // O(1) - O(n)
        System.out.println(persons.get("Albert")); // O(1) - O(n)

        System.out.println(Math.abs("John".hashCode() % 10));
        System.out.println(Math.abs("Mike".hashCode() % 10));
        System.out.println(Math.abs("Bob".hashCode() % 10));
        System.out.println(Math.abs("Alice".hashCode() % 10));

        Map<String, Person> sortedPersons = new TreeMap<>(Comparator.nullsLast(Comparator.comparingInt(String::length)));
        sortedPersons.put("John", new Person("John", 15));
        sortedPersons.putIfAbsent("Mike", new Person("Mike", 23));
        sortedPersons.put("Bob", new Person("Bob", 42));
        sortedPersons.put("Alice", new Person("Alice", 27));
        System.out.println(sortedPersons);

        sortedPersons.remove("Alice");
        System.out.println(sortedPersons);

        Set<Map.Entry<String, Person>> entries = sortedPersons.entrySet();
        System.out.println(entries);
    }
}
