package JavaClasses.class2;
import java.util.Scanner;


public class Ask1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Give the name, age and am: ");
        String name = s.next(); // first var
//        System.out.print("Give the age: ");
        int age = s.nextInt();
//        System.out.print("Give the am: ");
        String am = s.next();

        System.out.println("Customer name is "+name);
        System.out.println("Customer age is "+age);
        System.out.println("Customer am is "+am);
        // or
        System.out.printf("%nCustomer name is %s%nCustomer age is %s%nCustomer am is %s%n", name, age, am);
    }
}
