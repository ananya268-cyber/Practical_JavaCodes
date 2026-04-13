import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * percent / 100;
        }
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------------");
    }
}

public class EmpSalaryRaise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        boolean addMore = true;

        while (addMore) {
            System.out.println("Enter Employee Details:");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            employees.add(emp);

            System.out.print("Do you want to add another employee? (yes/no): ");
            sc.nextLine();
            String choice = sc.nextLine().trim().toLowerCase();
            addMore = choice.equals("yes");
        }

        System.out.println("\nBefore Salary Raise:");
        for (Employee e : employees) {
            e.display();
        }
        for (Employee e : employees) {
            System.out.print("Enter raise percentage for " + e.getName() + ": ");
            double percent = sc.nextDouble();
            e.raiseSalary(percent);
        }
        System.out.println("\nAfter Salary Raise:");
        for (Employee e : employees) {
            e.display();
        }

        sc.close();
    }
}

