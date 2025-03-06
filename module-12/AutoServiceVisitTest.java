// Jose Franco
// 03/05/2025
// M12 - Programming Assignment  - Main Method Test AutoServiceVisit

public class AutoServiceVisitTest {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("\nWELCOME TO FRANCO AUTO CARE!\n");
       
        System.out.println("************************************");
        System.out.println("*          OUR SERVICES            *");
        System.out.println("************************************");
        System.out.println("* - Standard Service  $100.00      *");
        System.out.println("* - Oil Change        $30.00       *");
        System.out.println("* - Tire Rotation     $40.00       *");
        System.out.println("************************************\n");

        // Testing each method twice
        System.out.println("(Test 1 - No parameters) Standard Service: $" + AutoServiceVisit.yearlyService());
        System.out.println("(Test 2 - No parameters) Standard Service: $" + AutoServiceVisit.yearlyService()+"\n");
        
        System.out.println("(Test 1 - One parameter) Service with Oil Change: $" + AutoServiceVisit.yearlyService(true));
        System.out.println("(Test 2 - One parameter) Service with Oil Change: $" + AutoServiceVisit.yearlyService(false)+"\n");
        
        System.out.println("(Test 1 - Two parameters) Service with Oil Change and Tire Rotation: $" + AutoServiceVisit.yearlyService(true, true));
        System.out.println("(Test 2 - Two parameters) Service with Oil Change and Tire Rotation: $" + AutoServiceVisit.yearlyService(true, false)+"\n");
        
        System.out.println("(Test 1 - Three parameters) Service with Oil Change, Tire Rotation, and $20 Coupon: $" + AutoServiceVisit.yearlyService(true, true, 20.0));
        System.out.println("(Test 2 - Three parameters) Service with Oil Change, Tire Rotation, and $50 Coupon: $" + AutoServiceVisit.yearlyService(true, true, 50.0)+"\n");
    }
}
