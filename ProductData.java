package carsandtrucks;

interface ProductInterface {

    int getCost();

    void setCost(int cost);

    String getName();

    void setName(String name);

    int getWeight();

    void setWeight(int weight);

    void print();
}

public class ProductData implements ProductInterface {

    int cost;
    int weight;
    String name;
    static int count = 0;

    public ProductData(int par, double par1, String laptop) {
        this.cost = 5;
        this.name = "btats";
        count++;
    }

    public ProductData(int cost, String name) {
        this.cost = cost;
        this.name = name;
        count++;
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
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.print("Price: " + cost);
        System.out.println("    Product Name: " + name);
    }
}


 class ProductData2 implements ProductInterface {
    private double price;
    private int quantity;
    private int weight;
    private String marketName;

    public ProductData2() {
        this.price = 0.0;
        this.quantity = 0;
        this.weight = 0;
        this.marketName = "";
    }

    public ProductData2(double price) {
        this.price = price;
        this.quantity = 0;
        this.weight = 0;
        this.marketName = "";
    }

    public ProductData2(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.weight = 0;
        this.marketName = "";
    }

    public ProductData2(int weight, double price, String marketName) {
        this.price = price;
        this.weight = weight;
        this.marketName = marketName;
    }

    @Override
    public int getCost() {
        return (int) price;
    }

    @Override
    public void setCost(int cost) {
        this.price = cost;
    }

    @Override
    public String getName() {
        return marketName;
    }

    @Override
    public void setName(String name) {
        this.marketName = name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + quantity);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int calculate(int quantity, double price) {
        double sum = quantity * price;
        System.out.println("Total Value: " + sum);
        return 0;
    }

    public void printProductData() {
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + quantity);
    }
}
