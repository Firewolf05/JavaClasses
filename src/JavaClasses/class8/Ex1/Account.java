package JavaClasses.class8.Ex1;

public class Account {
    private static final double RATE = 1.5;
    private String name;
    private String acctNumber;
    private double balance;

    public Account(String name, String acctNumber, double balance) {
        this.name = name;
        this.acctNumber = acctNumber;
        this.balance = balance;
    }

    public Account(String name, String acctNumber) {
        this.name = name;
        this.acctNumber = acctNumber;
        this.balance = 0; // not needed since java assigns 0 to empty ints but why not
    }

}


