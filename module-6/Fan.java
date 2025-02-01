// Jose Franco
// 02/01/25
// M6 - Assignment: This program defines a Fan class with both a no-argument and parameterized constructor to set default and custom values. 
// It prints the default state, updates the fan's settings using setters and getters, and then displays the new state.

public class Fan {
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
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        return "Fan [" + (on ? "ON, Speed: " + speed : "OFF, Speed: " + speed) + ", Color: " + color + ", Radius: " + radius + "]\n";
    }

    // Testing
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Fan Program");
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 8.5, "yellow");

        System.out.println("\nDefault Fan: " + fan1);
        System.out.println("\nCustomized Fan: " + fan2);

        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(10.0);
        fan1.setColor("black");

        System.out.println("\nUpdated Default Fan: " + fan1);
    }
}
