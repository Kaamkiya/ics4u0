/**
 * Author: Zia M
 * Date: Nov 10, 2026
 * Topic: array list of refernece type
 */
import java.util.*;

public class Lesson2_ArrayListOfObjects {
    public static void main(String[] args) {
        ArrayList<Student> q = new ArrayList<>();
        q.add(new Student("Octet", 888, 12));
        q.add(new Student("Tigris", 919, 10));
        q.add(new Student("Coyote", 610, 11));
        q.add(new Student("Owl", 8884, 11));
        //System.out.println(q);

        for (Student s:q) {
            System.out.println(s);
        }
    }
}

class Student {
    private String name;
    private int idNum;
    private int grade;

    public Student(String n, int i, int g) {
        name=n;idNum=i;grade=g;
    }

    @Override
    public String toString() {
        return "Name: "+name+", Student Number: "+idNum+", Grade: "+grade;
    }
}
