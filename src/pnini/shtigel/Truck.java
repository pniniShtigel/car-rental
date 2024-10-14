package pnini.shtigel;

public class Truck extends Vehicle{

    private int capacity;  // קיבולת בטון

    public Truck(String licensePlate, String make, String model, double rentalPrice, int capacity) {
        super(licensePlate, make, model, rentalPrice);
        this.capacity = capacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalPrice() * days) + (capacity * 10); // עלות נוספת על כל טון
    }

    public int getCapacity() {
        return capacity;
    }
}
