import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape (circle, rectangle, trapezoid, triangle):");
        String shape = scanner.nextLine();

        switch (shape.toLowerCase()) {
            case "circle":
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area of the circle: " + circle.calculateArea());
                break;
            case "rectangle":
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Area of the rectangle: " + rectangle.calculateArea());
                break;
            case "trapezoid":
                System.out.print("Enter the lengths of the bases of the trapezoid: ");
                double base1 = scanner.nextDouble();
                double base2 = scanner.nextDouble();
                System.out.print("Enter the height of the trapezoid: ");
                double height = scanner.nextDouble();
                Trapezoid trapezoid = new Trapezoid(base1, base2, height);
                System.out.println("Area of the trapezoid: " + trapezoid.calculateArea());
                break;
            case "triangle":
                System.out.print("Enter the base length of the triangle: ");
                double baseLength = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double triangleHeight = scanner.nextDouble();
                Triangle triangle = new Triangle(baseLength, triangleHeight);
                System.out.println("Area of the triangle: " + triangle.calculateArea());
                break;
            default:
                System.out.println("Invalid shape entered!");
        }

        scanner.close();
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Trapezoid {
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double calculateArea() {
        return (base1 + base2) * height / 2;
    }
}

class Triangle {
    private double baseLength;
    private double height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    public double calculateArea() {
        return baseLength * height / 2;
    }
}
