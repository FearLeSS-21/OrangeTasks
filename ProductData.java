package product;

public class ProductData {

    int cost;
    String name;
    static int count = 0;

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

    public String toString() {

        return cost + name;

    }

}
