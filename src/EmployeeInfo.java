import java.util.Scanner;

class Employee1 {
    private int id;
    private String name;
    private double salary;


    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void incrementSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        } else {
            System.out.println("Increment amount must be positive.");
        }
    }


    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Current Salary: " + salary);
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee1 emp = new Employee1(id, name, salary);

        System.out.println("Before Increment:");
        emp.displayInfo();


        System.out.println("Enter Increment Amount: ");
        double increment = sc.nextDouble();

        emp.incrementSalary(increment);

        System.out.println("After Increment:");
        emp.displayInfo();

        sc.close();
    }
}
