package product;

import java.util.Scanner;

public class Product {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Empty constructor with basic Vars.
        ProductData x = new ProductData();
        x.Print();

        //constructor add here by me .
        ProductData x1 = new ProductData(1200, "bata");
        System.out.print("Before Setter and Getter ->  ");
        x1.Print();

        //Edit Data in constructor to certian value using Setter and Getter.
        System.out.print("After Setter and Getter ->   ");
        x1.setCost(120);
        x1.setName("banana");

        x1.Print();

        System.out.println("The Total Count is = " + ProductData.count);

        // Constructor used to print data given by User Directly.
        int price = scanner.nextInt();
        String name = scanner.next();

        ProductData x2 = new ProductData(price, name);
        x2.Print();

    }

}
