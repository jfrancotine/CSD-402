// Jose Franco
// 02/08/25
// M7 - Assignment: This program will use code from previous M6 assignment, where a collection of Fan instances will be created as well as a method taking a
// collection or a single of Fan instances for displaying without using toString(). Use of 'this' reference where allowed.

import java.util.ArrayList;
import java.util.List;

class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No argument constructor with default values
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with parameters
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Display fan without toString
    public void displayFan() {
        System.out.println("Fan Details: " + (this.on ? "ON" : "OFF") + ", Speed: " + this.speed + ", Color: " + this.color + ", Radius: " + this.radius);
    }
}

public class UseFans {
    // Method to display a single Fan instance
    public static void displayFanInstance(Fan fan) {
        fan.displayFan();
    }

    // Method to display a collection of Fan instances
    public static void displayFanCollection(List<Fan> fans) {
        for (Fan fan : fans) {
            fan.displayFan();
        }
    }

    // Test
    public static void main(String[] args) {
        System.out.println("\nWelcome to the UseFans Program!");
        
        // Creating a collection of Fans
        List<Fan> fans = new ArrayList<>();
        fans.add(new Fan()); // Default fan
        fans.add(new Fan(Fan.FAST, true, 8.5, "yellow"));
        fans.add(new Fan(Fan.MEDIUM, true, 7.0, "blue"));
        fans.add(new Fan(Fan.SLOW, false, 5.5, "red"));

        // Displaying single fan instance
        System.out.println("\nDisplaying a single Fan:");
        displayFanInstance(fans.get(1));

        // Displaying all fan instances in the collection
        System.out.println("\nDisplaying all Fans in collection:");
        displayFanCollection(fans);
        System.out.println();
    }
}
