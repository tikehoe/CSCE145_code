// Tyler Kehoe
// This class extends Ship and adds properties for passenger capacity and crew size.

public class CruiseShip extends Ship {
    private int passengerCapacity;
    private int crew;

    // Constructor
    public CruiseShip(String name, String launchDate, int passengerCapacity, int crew) {
        super(name, launchDate);
        this.passengerCapacity = passengerCapacity;
        this.crew = crew;
    }

    // Accessors and Mutators
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    // Override toString
    @Override
    public String toString() {
        return "Name: " + getName() + "\nPassenger Capacity: " + passengerCapacity + "\nCrew: " + crew;
    }
}
