package JavaClasses.class2;
import java.util.Scanner;

public class Ask4 {
    public static class MyMethods {
        public static int findmax(int a, int b, int c) {
            int max = a;
            if (max<b) max=b;
            if (max<c) max=c;
            return max;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give three numbers: ");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();
        System.out.printf("Max of %d, %d and %d is %d", num1, num2, num3, MyMethods.findmax(num1, num2, num3));
    }
}
