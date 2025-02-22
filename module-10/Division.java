// Jose Franco
// 02/21/25
// M10 - Programming Assignment

abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Constructor
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }
    // Abstract method
    public abstract void display();
}
