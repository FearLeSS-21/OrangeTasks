package carsandtrucks;

public class DigitalProducts implements ProductInterface {
    private int cost;
    private String name;
    private final int weight = 0;

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        // Digital products have no weight, so this method does nothing
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Cost: " + cost + ", Weight: " + weight + ", Name: " + name);
    }

    public DigitalProducts(int cost) {
        this.cost = cost;
        this.name = "digital product";
    }
}
