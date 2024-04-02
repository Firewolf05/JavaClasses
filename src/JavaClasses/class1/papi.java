package JavaClasses.class1;

public class papi {
    public static void main(String[] args) {
        X a = new X(2,3);
        //using copy
        X a1 = new X(a);
        // έχουμε 2 αντικείμενα με τις ίδιες τιμές
        // vs
         X a2 = a;
        // 2 μεταβλητές για το ίδιο αντικείμενο


        System.out.println(a.getI());
        a.setI(10);
        System.out.println(a.getI());


        Surface s1 = new Surface("A", 3,5);
        System.out.println(s1.getSurface());
    }
}
