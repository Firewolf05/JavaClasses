// 23/4/2024

package JavaClasses.class8.Ex1;

public class Main {
    public static void main(String[] args) {
        Account act = new Account("George", "00345", 100);
//        System.out.println("BALANCE: "+act.balance);
//        act.deposit(100); System.out.println("BALANCE: "+act.balance);
//        act.withdraw(150); System.out.println("BALANCE: "+act.balance);
//        act.deposit(-100); System.out.println("BALANCE: "+act.balance);
//        act.withdraw(-150); System.out.println("BALANCE: "+act.balance);
//        act.withdraw(60); System.out.println("BALANCE: "+act.balance);
//        act.withdraw(50); System.out.println("BALANCE: "+act.balance);
        act.addInterest(); System.out.println("Account Balance: " + act.getBalance());
        act.addInterest(); System.out.println("Account Balance: " + act.getBalance());
        System.out.println(act);

    }
}
