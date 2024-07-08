package product;

interface ProductInterface {

    void getCost();

    void setCost(int cost);

    void getName();

    void setName(String name);

    void getWeight();

    void setWeight(int weight);

    void print();
}

public class ProductData {

    int cost;
    int weight;
    String name;
    static int count = 0;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Constructor 1
    public ProductData() {
        cost = 5;
        name = "btats";

    }

    public ProductData(int cost, String name) {

        this.cost = cost;
        this.name = name;
        count++;
    }

    public void Print() {

        System.out.print("Price:" + cost);
        System.out.println("    Product Name:" + name);

    }

}

class ProductData2 implements ProductInterface {

    private int cost;
    private int weight;
    private String name;

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
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

    public ProductData2(int cost, String name, int weight) {

        this.name = name;
        this.weight = weight;
        this.cost = cost;

    }

}








