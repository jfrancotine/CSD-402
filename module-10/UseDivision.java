// Jose Franco
// 02/21/25
// M10 - Programming Assignment - Implementing abstract classes and methods.

public class UseDivision {
    public static void main(String[] args) {
        System.out.println("\nFRANCO SOLUTIONS LLC\n");
        // Creating two international divisions
        InternationalDivision italyDivision = new InternationalDivision("Europe Branch", 1001, "Italy", "Italian");
        InternationalDivision venezuelaDivision = new InternationalDivision("South America Branch", 1002, "Venezuela", "Spanish");

        // Creating two domestic divisions
        DomesticDivision californiaDivision = new DomesticDivision("West Coast Operations", 2001, "California");
        DomesticDivision texasDivision = new DomesticDivision("Southern Operations", 2002, "Texas");

        // Displaying division details
        italyDivision.display();
        venezuelaDivision.display();
        californiaDivision.display();
        texasDivision.display();
    }
}
