import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;
    private double marks;

    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("-------------------------");
    }
}

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean addMore = true;
        while (addMore) {
            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            Student s = new Student(roll, name, marks);
            s.display();

            System.out.print("Do you want to add another student? (yes/no): ");
            sc.nextLine();
            String choice = sc.nextLine().trim().toLowerCase();
            addMore = choice.equals("yes");
        }

        sc.close();
    }
}



