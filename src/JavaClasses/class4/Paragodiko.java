package JavaClasses.class4;
import java.util.Scanner;
public class Paragodiko {
    public String scalcParagodiko(int num) {
//        int res=1;
        String res = "";
        if (num == 0)
            res = "0";
        else if (num == 1)
            res = "0";
        else {

            for (int i = 1; i <= num; i++) {
                res = res + "*" + (new Integer(i)).toString();
            }
        }
        return res;
    }

    public int calcParagodiko(int num) {
        int res=1;


        for (int i = 1; i <= num; i++) {
            res*=i;
            }

        return res;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("give number:");
        int num=s.nextInt();
        Paragodiko p = new Paragodiko();
        System.out.printf("%d!=%s%n", num, p.scalcParagodiko(num));
    }
}
