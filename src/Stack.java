import java.util.*;

class StackDef {
    private int[] arr = new int[10];
    private int top = -1;

    public void push(int value) {
        if (top == 9) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed");
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackDef s = new StackDef();

        System.out.println("Enter up to 10 elements for the stack:");
        int n = sc.nextInt();   // number of elements to insert (<=10)

        if (n > 10) {
            System.out.println("You can only insert up to 10 elements.");
            n = 10;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            int val = sc.nextInt();
            s.push(val);
        }

        System.out.println("Stack created successfully with " + n + " elements.");
    }
}


