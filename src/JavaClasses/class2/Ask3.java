package JavaClasses.class2;
import java.util.Scanner;

public class Ask3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        String msg = "Sum of ";
        int count = 0;
        System.out.println("Give numbers util 0: ");
        do {
            num = s.nextInt();
            if (sum!=0 && num!=0) {
                msg+="+";
                sum += num;
                msg+=num;
            } else if (sum == 0) {
                sum+=num;
                msg+=num;
            }
        } while (num!=0);
        System.out.printf("%s=%d", msg, sum);
    }
}
