package carsandtrucks;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    protected List<ProductData2> transportedProducts;
    protected int weightLoad;
    protected String vehicleId;
    private boolean overloaded = false; // Added overloaded flag

    public Vehicle(String vehicleId, int weightLoad) {
        this.vehicleId = vehicleId;
        this.weightLoad = weightLoad;
        this.transportedProducts = new ArrayList<>();
    }

    public void printTransportedProductNames() {
        for (ProductData2 product : transportedProducts) {
            System.out.println(product.getName());
        }
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (ProductData2 product : transportedProducts) {
            totalWeight += product.getWeight();
        }
        return totalWeight;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (ProductData2 product : transportedProducts) {
            totalPrice += product.getCost();
        }
        return totalPrice;
    }

    public int getNumberOfProducts() {
        return transportedProducts.size();
    }

    public void addProduct(ProductData2 product) throws Exception {
        if (getTotalWeight() + product.getWeight() <= weightLoad) {
            transportedProducts.add(product);
        } else {
            setOverloaded(true); // Mark the vehicle as overloaded
            throw new Exception("Above Weight");
        }
    }

    // Getter and setter for overloaded flag
    public boolean isOverloaded() {
        return overloaded;
    }

    public void setOverloaded(boolean overloaded) {
        this.overloaded = overloaded;
    }

    public abstract void displayVehicleInfo();
}