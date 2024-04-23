package JavaClasses.class7;

import java.io.*;

public class DemoSerialize {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.AM = "p2322";
        s1.email = "george@unipi.gr";
        s1.name = "George";
        serializeStudent(s1);

//        Student s2 = deserializeStudent();
//        System.out.println(s2);
        
    }

    // to serialize/deserialize an object, its class has to implement serializable interface
    static void serializeStudent(Student s) {
        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos); // pulls object attributes from memory then FileOutputStream writes them to file
            oos.writeObject(s);
            oos.close();
            fos.close();// !!IMPORTANT!! always close both FileOutputStream and ObjectOutputSteam
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static Student deserializeStudent() {
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student tempStudent;
            tempStudent = (Student)ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Done!");
            return tempStudent;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
