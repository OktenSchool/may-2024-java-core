package org.okten.jcfdemo;

import java.util.*;

import static java.util.Comparator.comparingInt;
import static java.util.Comparator.nullsLast;

public class CollectionsDemo {

    // JCF - Java Collection Framework
    // O(n) - medium element find operation

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(3);
        names.add("Alice");
        names.add("Bob");
        names.add(null);
        names.add("Mike");
        names.add("John");
        names.add("Alice");
        System.out.println(names);

        names.contains("John"); // O(n)

        names.sort(nullsLast(comparingInt(String::length).thenComparing(Comparator.naturalOrder())));
        System.out.println("Sorted names: " + names);

        names.remove("John");
        System.out.println(names);

        List<String> linkedNames = new LinkedList<>();
        linkedNames.add("Alice");
        linkedNames.add("Bob");
        linkedNames.add(null);
        linkedNames.add("John");
        linkedNames.add("Alice");
        linkedNames.add("Mike");
        System.out.println(linkedNames);

        linkedNames.remove("John");
        System.out.println(linkedNames);

        Set<String> uniqueNames = new HashSet<>(); // unordered set
        uniqueNames.addAll(names);
        System.out.println("Unique names: " + uniqueNames);

        uniqueNames.contains("John"); // O(1)

        Set<String> uniqueNames2 = new LinkedHashSet<>(); // ordered set
        uniqueNames2.add("Alice");
        uniqueNames2.add("Bob");
        uniqueNames2.add(null);
        uniqueNames2.add("John");
        uniqueNames2.add("Alice");
        uniqueNames2.add("Mike");
        System.out.println("Unique names 2: " + uniqueNames2);

        Set<String> sortedSet = new TreeSet<>(Comparator.nullsLast(Comparator.comparingInt(String::length)));
        sortedSet.add("Alice");
        sortedSet.add("Bob");
        sortedSet.add(null);
        System.out.println("Mike was added: " + sortedSet.add("Mike"));
        System.out.println("John was added: " + sortedSet.add("John"));
        sortedSet.add("Alice");
        System.out.println("Sorted set: " + sortedSet);

        System.out.println(sortedSet.contains("John")); // O(log n)
    }

    public static class Node<T> {

        T element;

        Node<T> next;

        Node<T> prev;
    }

    // O(n^2)
    private static void method(Collection<String> texts) {
        for (String text : texts) {
            for (char c : text.toCharArray()) {
                System.out.println(c);
            }
        }
    }
}
