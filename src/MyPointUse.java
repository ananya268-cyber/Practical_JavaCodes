import java.util.Scanner;

class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class MyPointUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyPoint p1 = new MyPoint();
        System.out.println("Default Point: " + p1);

        System.out.print("Enter x coordinate: ");
        int xInput = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int yInput = sc.nextInt();
        MyPoint p2 = new MyPoint(xInput, yInput);
        System.out.println("Point from input: " + p2);

        System.out.print("Enter new x: ");
        int newX = sc.nextInt();
        System.out.print("Enter new y: ");
        int newY = sc.nextInt();
        p2.setXY(newX, newY);
        System.out.println("Updated Point: " + p2);

        int[] coords = p2.getXY();
        System.out.println("Coordinates in array: [" + coords[0] + ", " + coords[1] + "]");

        System.out.println("Final Point description: " + p2.toString());
    }
}
