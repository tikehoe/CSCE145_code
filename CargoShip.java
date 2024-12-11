// Tyler Kehoe
// This class extends Ship and adds properties for tonnage and maximum speed.

public class CargoShip extends Ship {
    private double tonnage;
    private double maxSpeed;

    // Constructor
    public CargoShip(String name, String launchDate, double tonnage, double maxSpeed) {
        super(name, launchDate);
        this.tonnage = tonnage;
        this.maxSpeed = maxSpeed;
    }

    // Accessors and Mutators
    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Override toString
    @Override
    public String toString() {
        return "Name: " + getName() + "\nTonnage: " + tonnage + " DWT\nMaximum Speed: " + maxSpeed + " mph";
    }
}
