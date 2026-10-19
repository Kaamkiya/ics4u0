/*
 * Author: Zia M
 * Date: Oct 19, 2026
 * Topic: student
 */
import java.util.*;

public class Lesson2_StudentTester {
    public static void main(String[] args) {
        int[] m={60, 70, 80, 90};
        Student q = new Student("Wonky", m);
        System.out.println(q);
    }
}

class Student {
    private String name;
    private int[] marks;

    public Student() {
        name=null;
        marks = new int[0];
    }

    public Student(String n, int[] m) {
        name=n;
        marks=m;
    }

    public void setName(String n) {
        name=n;
    }
    public String getName() {
        return name;
    }
    public void setMarks(int[] m) {
        marks=m;
    }
    public int[] getMarks() {
        return marks;
    }
    public double average() {
        int sum=0;
        for (int n:marks) {
            sum+=n;
        }
        return (double)sum/marks.length;
    }

    @Override
    public String toString() {
        return "Name: "+name+", marks: "+Arrays.toString(marks);
    }
}
