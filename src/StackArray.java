import java.util.Scanner;

class StackDemo {
    private int[] arr = new int[10];
    private int top = -1;
    public void push(int value) {
        if (top == 9) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
        }
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + arr[top--]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}
public class StackArray {
    public static void main(String[] args) {
        StackDemo str = new StackDemo();

        System.out.println("Enter the number of elements you want in your stack between 0-10");
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        for (int i=0; i <elements; i++){
            System.out.println("enter element at index" + i );
            int value = sc.nextInt();
            str.push(value);
        }
        System.out.println("Do you want to pop any element? (y/n)");
        char wannapop = sc.next().charAt(0);
        if (wannapop == 'y'){
            str.pop();
            System.out.println("Element popped");
        }
        System.out.println("Elements displayed");
        str.display();
    }
}
