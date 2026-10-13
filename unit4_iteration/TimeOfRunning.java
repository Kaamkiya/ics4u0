/**
 * Author: Zia M
 * Date: Oct 08, 2026
 * Subject: time of running of a program (big O notation)
 */
 
public class TimeOfRunning {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for (int i = 1; i < 1000; i++) {
            System.out.print(i+", ");
        }
        long endTime = System.nanoTime();
        long runTime = endTime-startTime;
        System.out.println("This program took "+runTime+" nanoseconds");
    }
}
