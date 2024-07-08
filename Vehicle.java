package carsandtrucks;

abstract class Vehicle {

    protected int weight;

    public Vehicle(int weight) {
        this.weight = weight;
    }

    abstract int getVehicleWeightLoad();

    void print() {

        System.out.print(weight);
    }
}
