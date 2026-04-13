import java.util.Scanner;

class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Car \"" + name + "\" is starting with a key ignition.");
    }
}

class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Bike \"" + name + "\" is starting with a self-start button.");
    }
}

class Truck extends Vehicle {
    public Truck(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Truck \"" + name + "\" is starting with a heavy-duty ignition system.");
    }
}

public class VehicleOverride {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Choose a vehicle type: 1. Car  2. Bike  3. Truck");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter vehicle name: ");
            String name = sc.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Vehicle name cannot be empty.");
                return;
            }

            Vehicle vehicle;
            switch (choice) {
                case 1:
                    vehicle = new Car(name);
                    break;
                case 2:
                    vehicle = new Bike(name);
                    break;
                case 3:
                    vehicle = new Truck(name);
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
                    return;
            }

            vehicle.start();

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter correct values.");
        } finally {
            sc.close();
        }
    }
}
