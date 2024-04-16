package JavaClasses.class6.Ex1;
//import javax.swing.*;
//import java.util.*;

import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {
        Clock c = new Clock(16, 28, 58);
        for (int i = 0; i <= 18; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.print(c);
//            JOptionPane.showMessageDialog(null, c.toString());
            c.Tick();
        }
    }
}
