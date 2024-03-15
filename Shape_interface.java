
// Interface representing a shape
interface Shape {
    // Method to find area
    double findArea();
}

// Class representing a square
class Square implements Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Implementation of findArea method for square
    public double findArea() {
        return side * side;
    }
}

// Class representing a rectangle
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of findArea method for rectangle
    public double findArea() {
        return length * width;
    }
}

// Main class
public class Shape_interface {
    public static void main(String[] args) {
        // Creating a square object and finding its area
        Shape square = new Square(5);
        System.out.println("Area of square: " + square.findArea());

        // Creating a rectangle object and finding its area
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of rectangle: " + rectangle.findArea());
    }
}
