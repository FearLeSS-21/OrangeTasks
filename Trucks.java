
package carsandtrucks;


class Trucks extends Vehicle {
    
    public Trucks(int weightLoad) {
        super(weightLoad);
    }

    
    @Override
    int getVehicleWeightLoad() {
        return weight * 4;
    }
}

