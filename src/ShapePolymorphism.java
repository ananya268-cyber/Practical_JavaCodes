import java.util.Scanner;

abstract class ShapeBase {
    abstract void draw();
    abstract void erase();
}

class CircleShape extends ShapeBase {
    void draw() {
        System.out.println("Drawing a Circle");
    }
    void erase() {
        System.out.println("Erasing the Circle");
    }
}

class TriangleShape extends ShapeBase {
    void draw() {
        System.out.println("Drawing a Triangle");
    }
    void erase() {
        System.out.println("Erasing the Triangle");
    }
}

class SquareShape extends ShapeBase {
    void draw() {
        System.out.println("Drawing a Square");
    }
    void erase() {
        System.out.println("Erasing the Square");
    }
}

public class ShapePolymorphism {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Choose a shape to work with (circle/triangle/square): ");
        String chosenShape = inputScanner.nextLine().toLowerCase();

        ShapeBase shapeObject;

        switch (chosenShape) {
            case "circle":
                shapeObject = new CircleShape();
                break;
            case "triangle":
                shapeObject = new TriangleShape();
                break;
            case "square":
                shapeObject = new SquareShape();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        shapeObject.draw();
        shapeObject.erase();
    }
}