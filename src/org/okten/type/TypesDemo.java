package org.okten.type;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class TypesDemo {

    private static boolean isConnected;

    private static String globalText;

    public static void main(String[] args) {
        System.out.println(isConnected);
        System.out.println(globalText);

        int i = 2_147_000_000;
        long l = 1249387429387929823L;
        BigInteger bigInteger = new BigInteger("8702934857203459827034985720398475023948570239487023948572039485720394857");

        double d = 123.543;
        float f = 1.543432F;
        BigDecimal bigDecimal = new BigDecimal("23984723984729384.785462983745692");

        boolean bool = true;

        char letter = 'M'; // == char letter = 77;
        System.out.println(letter);

        String text = "loren ipsum ...";
        System.out.println(text);

        Person john = new Person("John", "Smith", 35);
        System.out.println(john);
        Person mike = new Person("Mike", 25);
        System.out.println(mike);

        Person[] persons = new Person[2];
        persons[0] = john;
        persons[1] = mike;
//        persons[2] = new Person("test", 132);
        System.out.println(Arrays.toString(persons));

        ArrayList dynamicPersons = new ArrayList();
        dynamicPersons.add(john);
        dynamicPersons.add(mike);
        dynamicPersons.add(new Person("test", 32));
        System.out.println(dynamicPersons);

        System.out.println("Difference between i++ and ++i");
        int test = 5;
        System.out.println("i++: " + test++ + " after increment: " + test);
        test = 5;
        System.out.println("++i: " + ++test + " after increment: " + test);

        System.out.println("For-loops");
        for (int index = 0; index < persons.length; index++) {
            System.out.println("From array: " + persons[index]);
        }

        System.out.println("For each");
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("Do while");
        int index = 0;
        do {
            System.out.println(persons[index]);
        } while (++index < persons.length);

        System.out.println("While");
        index = 10;
        while (index < persons.length) {
            System.out.println(persons[index++]);
        }
    }
}
