package org.okten;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Vehicle {

    private String model;

    private String registrationNumber;

    private Engine engine; // composition

    private Manufacturer manufacturer; // aggregation

    private Driver driver; // aggregation

    private VehicleType type;

    public void printInfo() {
        System.out.println("Manufacturer information: ");
        manufacturer.printInfo(this);

        System.out.println("Engine information: ");
        System.out.println(engine.model);

        System.out.println("Current driver: " + driver.getName());
    }

    @Data
    @AllArgsConstructor
    public class Engine {

        private String model;

        public void start() {
            System.out.println("Engine " + this.model + " of vehicle " + Vehicle.this.model + " is starting...");
        }
    }

    @Data
    @Builder
    public static class Manufacturer {

        private String name;

        public void printInfo(Vehicle vehicle) {
            System.out.println("Manufacturer of " + vehicle.model + " is " + name);
        }
    }
}
