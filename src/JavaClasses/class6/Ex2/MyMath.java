package JavaClasses.class6.Ex2;

public class MyMath {

    public static boolean isPrime (int n) {
        boolean ret=true;
        for (int i=2;i<n;i++) {
            if ((n%i) == 0) {
                ret=false;
                break;
            }
        }
        return ret;
    }

    public static int factorial(int n) {
//        int p=1;
        if (n>1) {
            return n* factorial(n-1);
        } else {
            return 1;
        }
//        return p;
    }

    public static int combinations(int n, int k) {
        return factorial(n)/(factorial(k)*factorial(n-k));
    }

    public static int digitsOfInteger(int n) {
//        String s = String.format("%d",n);
        String s = Integer.toString(n);
        return s.length();
    }

    public static int reverseDigits(int n) {
        StringBuffer x = new StringBuffer();
        String s = Integer.toString(n);
        for (int i=s.length()-1;i>=0;i--) {
            x.append(s.charAt(i));
        }
        return Integer.parseInt(x.toString());
    }

}
