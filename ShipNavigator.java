// Tyler Kehoe
// This is the main class to interact with the user and test the Ship project.

import java.util.Scanner;

public class ShipNavigator {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to ShipNavigator!!!");

        boolean createAnother = true;
        while (createAnother) {
            System.out.println("Enter the name of the ship: ");
            String name = key.nextLine();

            System.out.println("Enter its launch date (mm/dd/yyyy): ");
            String launchDate = key.nextLine();

            System.out.println("Is it a cruise ship or a cargo ship? ");
            String type = key.nextLine().toLowerCase();

            if (type.equals("cruise ship")) {
                System.out.println("Enter the ship's passenger capacity: ");
                int passengerCapacity = key.nextInt();

                System.out.println("How many crew members are on this ship? ");
                int crew = key.nextInt();
                key.nextLine(); // Consume newline

                CruiseShip cruiseShip = new CruiseShip(name, launchDate, passengerCapacity, crew);
                System.out.println("Creating a cruise ship...");
                System.out.println("Printing the ship's details:");
                System.out.println(cruiseShip);

            } else if (type.equals("cargo ship")) {
                System.out.println("Enter the ship's tonnage (DWT): ");
                double tonnage = key.nextDouble();

                System.out.println("Enter the maximum speed of the ship (in mph): ");
                double maxSpeed = key.nextDouble();
                key.nextLine(); // Consume newline

                CargoShip cargoShip = new CargoShip(name, launchDate, tonnage, maxSpeed);
                System.out.println("Creating a cargo ship...");
                System.out.println("Printing the ship's details:");
                System.out.println(cargoShip);

            } else {
                System.out.println("Invalid ship type. Please enter either 'cruise ship' or 'cargo ship'.");
            }

            System.out.println("Do you want to construct another ship object? Enter yes or no: ");
            String response = key.nextLine().toLowerCase();
            createAnother = response.equals("yes");
        }

        System.out.println("Goodbye!");
    }
}
