package JavaClasses.class2;
import java.util.Scanner;


public class Ask2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Give three numbers: ");
//        int num1 = s.nextInt();
//        int num2 = s.nextInt();
//        int num3 = s.nextInt();
//        int sum = num1 + num2 + num3;
//        System.out.printf("Sum of %d + %d + %d is %d", num1, num2, num3, sum);
        // second way
        System.out.println("How many numbers?");
        int numCount = s.nextInt();
        int nums[] = new int[numCount];
        int sum = 0;
        System.out.println("Give the "+numCount+" numbers");
        for (int i=0; i<numCount; i++) {
            nums[i] = s.nextInt();
            sum += nums[i];
        }
        System.out.println("Your sum is "+sum);
        // or
        System.out.print("Sum of ");
        for ( int i=0; i<numCount; i++) {
            System.out.print(nums[i]);
            if (i<numCount -1) System.out.print("+");
        }
        System.out.println("="+sum);
    }
}
