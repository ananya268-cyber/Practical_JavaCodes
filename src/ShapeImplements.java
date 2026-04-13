import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0 ||
                (sideA + sideB <= sideC) ||
                (sideA + sideC <= sideB) ||
                (sideB + sideC <= sideA)) {
            throw new IllegalArgumentException("Invalid triangle sides.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2; // semi-perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Heron's formula
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

public class ShapeImplements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter radius of the circle: ");
            double radius = sc.nextDouble();
            Shape circle = new Circle(radius);
            System.out.printf("Circle Area: %.2f%n", circle.calculateArea());
            System.out.printf("Circle Perimeter: %.2f%n", circle.calculatePerimeter());


            System.out.print("\nEnter three sides of the triangle: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            Shape triangle = new Triangle(a, b, c);
            System.out.printf("Triangle Area: %.2f%n", triangle.calculateArea());
            System.out.printf("Triangle Perimeter: %.2f%n", triangle.calculatePerimeter());

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

