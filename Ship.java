// Tyler Kehoe
// This class defines the base Ship class with common properties and behaviors.

public class Ship {
    private String name;
    private String launchDate;

    // Constructor
    public Ship(String name, String launchDate) {
        this.name = name;
        setLaunchDate(launchDate); // Use mutator to enforce validation
    }

    // Accessors and Mutators
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        // Validate launch date is between 1990 and 2019
        int year = Integer.parseInt(launchDate.split("/")[2]);
        if (year >= 1990 && year <= 2019) {
            this.launchDate = launchDate;
        } else {
            System.out.println("Error: Launch date outside 1990-2019. Setting default to 01/01/1990.");
            this.launchDate = "01/01/1990";
        }
    }

    // toString Method
    @Override
    public String toString() {
        return "Name: " + name + "\nLaunch Date: " + launchDate;
    }
}
