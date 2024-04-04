package JavaClasses.class3;

public class Main {

    int i;

    static int j;
//  static = belongs to class
    public static void main(String[] args) {
        Main m1 = new Main();
        m1.i = 15;
        Main m2 = new Main();
        m2.i = 100;
        Main m3 = new Main();
        m3.hello();
        //m3.hi();  // very bad practice
        //m3.j = 1; // same here

    }

    void hello(){
        System.out.println("Hello from object");
        doSomething(); // calls <object>.doSomething();
        hi();
    }

    void doSomething(){
        System.out.println("bye");
    }

    static void hi(){
        System.out.println("Hello from class");
    }
}
