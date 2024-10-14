package pnini.shtigel;

public abstract class Vehicle {
    private String licensePlate;//לוחיות רישוי
    private String make;//חברת ייצור
    private String model;//מודל
    protected double rentalPrice;//מחיר השכרה

    public Vehicle(String licensePlate, String make, String model, double rentalPrice) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public abstract double calculateRentalCost(int days);
}
