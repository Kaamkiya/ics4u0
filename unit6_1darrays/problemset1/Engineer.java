/**
 * Author: Zia M
 * Date: Oct 28, 2026
 * Topic: u6p1q1
 */
public class Engineer {
    private String title;
    private double yearlySalary;
    private int yearEmployed;

    public Engineer() {
        title=null;
        yearlySalary=0;
        yearEmployed=0;
    }

    public Engineer(String t, double y, int e) {
        title=t;yearlySalary=y;yearEmployed=e;
    }

    @Override
    public String toString() {
        return String.format("Title %s, Yearly Salary: $%.2f, Year Employed: %d", title, yearlySalary, yearEmployed);
    }
}
