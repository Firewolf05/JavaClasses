package JavaClasses.class3;

public class Demo {
    public static void main(String[] args) {
        // best practice: when using static members always prefix with class
        Main.hi();
        Main.j = 6;
        Main m1 = new Main();
        m1.i = 7;
        m1.doSomething();
    }
}
