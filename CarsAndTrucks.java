package carsandtrucks;

import java.util.Scanner;

public class CarsAndTrucks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vechile Type is (Truck Or Car) ?");
        String vehicleType = sc.nextLine();

        System.out.println("What is The load ?");
        int weight = sc.nextInt();

        Vehicle vechile1 = null;

        if (vehicleType.equalsIgnoreCase("Truck")) {
            vechile1 = new Trucks(weight);
        } else if (vehicleType.equalsIgnoreCase("Car")) {

            vechile1 = new Cars(weight);

        } else {
            System.out.print("Invalid Try Again");
        }
        System.out.println("The Load Is  " + vehicleType + " is: " + vechile1.getVehicleWeightLoad());
    }

}
