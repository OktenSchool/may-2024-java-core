package org.okten.exceptions;

public class ExceptionsDemo {

    public static void main(String[] args) {
        try {
            System.out.println(calculateEfficiency(100, 10));
            System.out.println(calculateEfficiency(100, 0));
//            System.out.println(calculateEfficiency(0, 10));
        } catch (BadFuelValueException e) {
            System.out.println("fuel value is bad: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
        System.out.println("...");
    }

    private static double calculateEfficiency(double distance, double fuel) throws BadFuelValueException {
        if (fuel == 0) {
            throw new BadFuelValueException("Fuel should be greater than 0");
        }
        if (distance <= 0) {
            throw new IllegalArgumentException("Distance should be grater than 0");
        }
        return distance / fuel;
    }
}
