package JavaClasses.class7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("name");
        strings.add("MAria");
        strings.add("George");

        String[] stringArray = new String[15];
        stringArray[2] = "George";

        // List<String> stringList = new List<String>(); // WRONG, 'List' is an interface, cannot create objects
        List<String> stringList = new LinkedList<>();
        List<String> stringList1 = new ArrayList<>(); // 'ArrayList' and 'LinkedList' implement the interface 'List'
        //Generic
        System.out.println(strings.contains("name"));
        System.out.println(strings.get(0));
    }
}
