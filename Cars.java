package carsandtrucks;

public class Cars extends Vehicle {
    public Cars(String vehicleId, int weightLoad) {
        super(vehicleId, weightLoad);
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Car ID: " + vehicleId);
        System.out.println("Weight Load: " + weightLoad);
    }
}
