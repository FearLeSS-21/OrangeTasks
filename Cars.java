package carsandtrucks;

class Cars extends Vehicle {
    
    public Cars(int weightLoad) {
        super(weightLoad);
    }

    @Override
    int getVehicleWeightLoad() {
        return weight;
    }
}
