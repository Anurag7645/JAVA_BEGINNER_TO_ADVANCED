
import java.util.Scanner;

// Interface for calculating volume
interface Volume {
    double calculateVolume();
}

// Interface for calculating shipping cost
interface ShippingCost {
    double calculateShippingCost(double distance, double costPerKm);
}

// Class representing a Box
class Box implements Volume {
    private double width;
    private double height;
    private double depth;

    // Constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return width * height * depth;
    }
}

// Class representing a Box with weight
class BoxWeight extends Box implements ShippingCost {
    private double weight;

    // Constructor
    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    // Method to calculate shipping cost
    public double calculateShippingCost(double distance, double costPerKm) {
        double volume = calculateVolume();
        return distance * volume * costPerKm;
    }
}

public class Box_interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the box
        System.out.println("Enter width, height, and depth of the box:");
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double depth = scanner.nextDouble();

        // Input weight of the box
        System.out.println("Enter weight of the box:");
        double weight = scanner.nextDouble();

        // Input shipping distance and cost per km
        System.out.println("Enter shipping distance (in km) and cost per km:");
        double distance = scanner.nextDouble();
        double costPerKm = scanner.nextDouble();

        // Create BoxWeight object
        BoxWeight box = new BoxWeight(width, height, depth, weight);

        // Calculate volume and shipping cost
        double volume = box.calculateVolume();
        double shippingCost = box.calculateShippingCost(distance, costPerKm);

        // Output results
        System.out.println("Volume of the box: " + volume);
        System.out.println("Shipping cost: " + shippingCost);

        scanner.close();
    }
}
