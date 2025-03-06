// Jose Franco
// 03/05/2025
// M12 - Programming Assignment - Calculating the cost of a yearly auto service visit.

public class AutoServiceVisit {
    // Standard service charge
    private static final double STANDARD_SERVICE_CHARGE = 100.0;
    private static final double OIL_CHANGE_FEE = 30.0;
    private static final double TIRE_ROTATION_FEE = 40.0;

    // Method with no parameters - returns the standard service charge
    public static double yearlyService() {
        return STANDARD_SERVICE_CHARGE;
    }

    // Method with one parameter - adds oil change fee
    public static double yearlyService(boolean oilChange) {
        return STANDARD_SERVICE_CHARGE + (oilChange ? OIL_CHANGE_FEE : 0);
    }

    // Method with two parameters - adds oil change fee and tire rotation fee
    public static double yearlyService(boolean oilChange, boolean tireRotation) {
        double total = STANDARD_SERVICE_CHARGE;
        if (oilChange) total += OIL_CHANGE_FEE;
        if (tireRotation) total += TIRE_ROTATION_FEE;
        return total;
    }

    // Method with three parameters - includes a coupon discount
    public static double yearlyService(boolean oilChange, boolean tireRotation, double coupon) {
        double total = STANDARD_SERVICE_CHARGE;
        if (oilChange) total += OIL_CHANGE_FEE;
        if (tireRotation) total += TIRE_ROTATION_FEE;
        total -= coupon; // Applying coupon
        return total > 0 ? total : 0; // Makes sure no negative
    }
}
