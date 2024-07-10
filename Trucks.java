package carsandtrucks;

public class Trucks extends Vehicle {
    public Trucks(String vehicleId, int weightLoad) {
        super(vehicleId, weightLoad);
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Truck ID: " + vehicleId);
        System.out.println("Weight Load: " + weightLoad);
    }
}
