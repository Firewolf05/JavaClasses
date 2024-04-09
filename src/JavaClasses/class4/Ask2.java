package JavaClasses.class4;
import java.util.Scanner;


public class Ask2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=0; int items=0; int positive=0; int negative=0; int min=0; int max=0; double avg=0.0; int sum=0;
        do {
            System.out.print("Give num: ");
            num=s.nextInt();
            sum+=num;
            if (num!=0) items++;
            if (num>0) positive++;
            if (num<0) negative++;
            if (items==1) {
                max=num; min=num;

            } else {
                if (num>max) max = num;
                if (num<min) min = num;

            }

        } while (num!=0);
        if (items!=0)
            avg=(double)sum/items;
        System.out.printf("Items   :%7d%n", items);
        System.out.printf("Negative:%7d%n", negative);
        System.out.printf("Positive:%7d%n", positive);
        System.out.printf("Avg     :%10.2f%n", avg);
        System.out.printf("Max     :%7d%n", max);
        System.out.printf("Min     :%7d%n", min);

    }
}
