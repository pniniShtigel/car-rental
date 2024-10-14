package pnini.shtigel;

import java.util.ArrayList;
import java.util.List;

public class VehicleRental {

    public static void main(String[] args) {
        // Create vehicles
        Vehicle car1 = new Car("ABC123", "Toyota", "Corolla", 50.0, "Sedan");
        Vehicle truck1 = new Truck("XYZ789", "Ford", "F-150", 100.0, 5);

        // Create customers
        Customer customer1 = new RegularCustomer("Pnina Shtigel");
        Customer customer2 = new CorporateCustomer("Chana Coen", "Verysoft");

        // Rent vehicles
        customer1.rentVehicle(car1, 3); // Regular customer rents car
        customer2.rentVehicle(truck1, 5); // Corporate customer rents truck

        // Show rented vehicles
        showRentedVehicles(customer1);
        showRentedVehicles(customer2);
    }

    public static void showRentedVehicles(Customer customer) {
        List<Vehicle> vehicles = customer.getRentedVehicles();
        System.out.println(customer.getName() + " has rented the following vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getMake() + " " + vehicle.getModel());
        }
    }


}

