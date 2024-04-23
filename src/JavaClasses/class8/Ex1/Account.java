package JavaClasses.class8.Ex1;

public class Account {
    private static final double RATE = 1.5;
    private String name;
    private String acctNumber;
    private double balance;

    private void setBalance(double balance) {
        this.balance = 0;
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public Account() {}

    public Account(String name, String acctNumber, double balance) {
        this.name = name;
        this.acctNumber = acctNumber;
        setBalance(balance);
    }

    public Account(String name, String acctNumber) {
        this(name, acctNumber, 0.0);

//        this.name = name;
//        this.acctNumber = acctNumber;
//        this.balance = 0; // not needed since java assigns 0 to empty ints but why not
    }

    public double deposit(double amount) {
        System.out.println("DEPOSIT: " + amount);
        if (amount > 0) {
            this.balance += amount;
        }
        return this.balance;
    }

    public double withdraw(double amount) {
        System.out.println("WITHDRAW: " + amount);
        if ((amount > 0) && ( amount<= this.balance)) {
            this.balance -= amount;
        }
        return this.balance;
    }

    public double addInterest() {
        double newAmount = 0;
        newAmount = this.balance * RATE / 100;
        newAmount = Math.round(newAmount*100)/100.0;
        System.out.println(newAmount);
        this.balance+=newAmount;
        return this.balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.acctNumber;
    }

    public String toString() {
        return String.format("Name: %s%nNumber: %s%nBalance: %5.2f%n", name, acctNumber, balance);
    }
}


