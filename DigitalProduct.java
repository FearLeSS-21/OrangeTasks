
package product;


public class DigitalProduct implements ProductInterface {
    
    private int cost;
    private String name;
    private final int weight = 0;

    @Override
    public void setWeight(int weight) {
        
    }

    @Override
    public void getWeight() {
        System.out.println("Weight: " + weight);
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void getCost() {
        System.out.println("Cost: " + cost);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Name: " + name);
    }

    @Override
    public void print() {
        System.out.println("Cost: " + cost + ", Weight: " + weight + ", Name: " + name);
    }

    public DigitalProduct(int cost) {
        this.cost = cost;
        this.name = "digital product";
    }
}

