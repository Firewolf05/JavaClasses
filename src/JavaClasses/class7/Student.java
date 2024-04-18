package JavaClasses.class7;

import java.io.Serializable;

public class Student implements Serializable {
    String AM;
    String email;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "AM='" + AM + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
