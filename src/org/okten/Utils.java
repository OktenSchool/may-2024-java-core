package org.okten;

public class Utils {

    private static final double K = 0.95;

    public static double calculateEfficiency(double distance, double fuel) {
        return distance / fuel * K;
    }
}
