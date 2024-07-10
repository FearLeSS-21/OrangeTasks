package carsandtrucks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CarsAndTrucks {

    private static Map<String, Vehicle> vehicles = new HashMap<>();
    private static Map<String, ProductData2> products = new HashMap<>();

    public static void main(String[] args) {
        try {
            loadVehicles("vehicles.txt");
            loadProducts("products.txt");
            loadProductsIntoVehicles("loadings.txt");
            generateOutput("output.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void loadVehicles(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String vehicleId = parts[0];
            int weightLoad = Integer.parseInt(parts[1]);
            String vehicleType = parts[2];

            Vehicle vehicle = null;
            if (vehicleType.equals("Car")) {
                vehicle = new Cars(vehicleId, weightLoad);
            } else if (vehicleType.equals("Truck")) {
                vehicle = new Trucks(vehicleId, weightLoad);
            }

            if (vehicle != null) {
                vehicles.put(vehicleId, vehicle);
            }
        }
        reader.close();
    }

    private static void loadProducts(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String productId = parts[0];
            String productType = parts[1];
            String productMarketName = parts[2];
            double productPrice = Double.parseDouble(parts[3]);
            int productWeight = productType.equals("Physical") ? Integer.parseInt(parts[4]) : 0;

            ProductData2 product;
            if (productType.equals("Digital")) {
                product = new ProductData2(productPrice);
            } else {
                product = new ProductData2(productWeight, productPrice, productMarketName);
            }
            product.setName(productMarketName);
            products.put(productId, product);
        }
        reader.close();
    }

    private static void loadProductsIntoVehicles(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String vehicleId = parts[0];
            String productId = parts[1];

            Vehicle vehicle = vehicles.get(vehicleId);
            ProductData2 product = products.get(productId);

            if (vehicle != null && product != null) {
                try {
                    vehicle.addProduct(product);
                } catch (Exception e) {
                    // Handle overload case within the generateOutput method
                }
            }
        }
        reader.close();
    }

    private static void generateOutput(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        for (Map.Entry<String, Vehicle> entry : vehicles.entrySet()) {
            Vehicle vehicle = entry.getValue();
            writer.write("Vehicle: " + vehicle.vehicleId + "\n");
            writer.write("Total weight: " + vehicle.getTotalWeight() + "kg\n");
            writer.write("Total price: $" + vehicle.getTotalPrice() + "\n");
            writer.write("Number of products: " + vehicle.getNumberOfProducts() + "\n");
            writer.write("Transported products:\n");
            for (ProductData2 product : vehicle.transportedProducts) {
                writer.write("  - " + product.getName() + " (Weight: " + product.getWeight() + "kg, Price: $" + product.getCost() + ")\n");
            }
            if (vehicle.isOverloaded()) {
                writer.write("Above Weight\n");
            }
            writer.write("\n");
        }
        writer.close();
    }
}