package org.okten;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        License johnLicense = License.builder()
                .number(123321)
                .code("abc")
                .issuedBy("0328").build();
        License newLicense = johnLicense.toBuilder()
                .number(123322).build();
        Driver driverJohn = Driver.builder()
                .name("John")
                .license(johnLicense).build();

        System.out.println(driverJohn);

        System.out.println("---------------------------------------------------------");

        double efficiency = Utils.calculateEfficiency(100, 20);
        System.out.println(efficiency);

        System.out.println("---------------------------------------------------------");

        Vehicle teslaS = Vehicle.builder()
                .model("Model S")
                .registrationNumber("AA4242AA").build();

        Vehicle.Engine teslaSEngine = teslaS.new Engine("EV100");
        teslaSEngine.start();

        Vehicle.Manufacturer teslaManufacturer = new Vehicle.Manufacturer("Tesla");
        teslaManufacturer.printInfo(teslaS);

        System.out.println("---------------------------------------------------------");

        Vehicle.Manufacturer audiManufacturer = new Vehicle.Manufacturer("Audi");
        Vehicle audiA6 = Vehicle.builder()
                .model("A6")
                .registrationNumber("AA9999AA")
                .manufacturer(audiManufacturer)
                .driver(driverJohn).build();
        Vehicle.Engine audiA6Engine = audiA6.new Engine("3.0 V6");
        audiA6.setEngine(audiA6Engine);

        audiA6.printInfo();

        System.out.println("---------------------------------------------------------");

        Vehicle audiA5 = Vehicle.builder()
                .model("A5")
                .registrationNumber("AA5555CC")
                .manufacturer(audiManufacturer)
                .driver(driverJohn)
                .type(VehicleType.CAR).build();
        Vehicle.Engine audiA5Engine = audiA5.new Engine("2.0");
        audiA5.setEngine(audiA5Engine);

        audiA5.printInfo();

        Vehicle ivecoBus = Vehicle.builder()
                .model("Bus Model 5")
                .registrationNumber("AA4532CC")
                .manufacturer(audiManufacturer)
                .driver(driverJohn)
                .type(VehicleType.BUS).build();
        Vehicle.Engine ivecoEngine = ivecoBus.new Engine("bus motor");
        ivecoBus.setEngine(ivecoEngine);
        ivecoBus.printInfo();

        Vehicle mercedesBus = Vehicle.builder()
                .model("C BUS CLASS SUPER MEGA PRO")
                .registrationNumber("MM4545MM")
                .manufacturer(audiManufacturer)
                .driver(driverJohn)
                .type(VehicleType.valueOf("BUS")).build();
        Vehicle.Engine mercedesBusEngine = mercedesBus.new Engine("bus motor");
        mercedesBus.setEngine(mercedesBusEngine);
        mercedesBus.printInfo();

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(audiA5);
        vehicles.add(ivecoBus);
        vehicles.add(mercedesBus);

        System.out.println("Customs control: ");
        for (Vehicle vehicle : vehicles) {
            System.out.println("Митний контроль проходить вид транспорту: " + vehicle.getType().getTranslation());
            if (VehicleType.CAR.equals(vehicle.getType())) {
                System.out.println(vehicle.getRegistrationNumber() + " goes to normal line");
            } else if (VehicleType.BUS.equals(vehicle.getType())) {
                System.out.println(vehicle.getRegistrationNumber() + " goes to special line");
            } else {
                System.out.println(vehicle.getRegistrationNumber() + " has unknown type");
            }
        }

        System.out.println("bus name() - " + VehicleType.BUS.name());
        System.out.println("bus ordinal() - " + VehicleType.BUS.ordinal());
        System.out.println("truck name() - " + VehicleType.TRUCK.name());
        System.out.println("truck ordinal() - " + VehicleType.TRUCK.ordinal());
        System.out.println("valueOf() - " + VehicleType.valueOf("BUS"));
    }
}
