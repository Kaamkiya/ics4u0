/**
 * Author: Zia M
 * Date: Oct 28, 2026
 * Topic: u6ps1q3
 */
public class StudentTester {
    public static void main(String[] args) {
        String[] names = {"Nakara", "Nikamma", "Badtameez", "Besharam", "Behosh", "Saale", "Koi", "Naam"};
        double[] marks = new double[8];
        for (int i=0;i<marks.length;i++) {
            marks[i] = (int)(Math.random()*100)+1;
        }
        Student s = new Student(names,marks);
        System.out.println(s);
        System.out.println("Sorted marks");
        for (double m:s.sort()) {
            System.out.print(m+"\t");
        }
        System.out.println();
        System.out.println("Class average");
        System.out.println(s.average());
        System.out.println("Class median");
        System.out.println(s.median());
    }
}
