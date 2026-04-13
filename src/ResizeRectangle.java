import java.util.Scanner;

interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + this.width);
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + this.height);
    }

    public void display() {
        System.out.println("Rectangle [Width: " + width + ", Height: " + height + "]");
    }
}

public class ResizeRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial width: ");
        int w = sc.nextInt();
        System.out.print("Enter initial height: ");
        int h = sc.nextInt();

        Rectangle rect = new Rectangle(w, h);
        rect.display();

        System.out.print("Enter new width: ");
        int newW = sc.nextInt();
        rect.resizeWidth(newW);

        System.out.print("Enter new height: ");
        int newH = sc.nextInt();
        rect.resizeHeight(newH);

        rect.display();
        sc.close();
    }
}



