package org.okten.functionalinterfaces;

import org.okten.Dog;
import org.okten.Movable;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {
        Supplier<String> supplierBase = new Supplier<String>() {
            @Override
            public String get() {
                return "";
            }
        }; // not recommended
        Supplier<String> supplier1 = () -> "test";
        Consumer<String> textPrinter = (text) -> {
            System.out.println("Printing the given text");
            System.out.println(text);
        };
        Consumer<String> textPrinter2 = (text) -> System.out.printf(text, 2);
        Consumer<String> textPrinter3 = System.out::println;

        textPrinter.accept(supplier1.get());
        textPrinter3.accept("text to print...");
    }
}
