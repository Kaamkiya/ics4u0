/*
 * Author: Zia M
 * Date: Oct 20, 2026
 * Topic: unit 5 problemset 1 question 2
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String f, String l, double m) {
        firstName = f;
        lastName = l;
        monthlySalary = m;
    }

    public void setFirstName(String f) { firstName = f; }
    public String getFirstName() { return firstName; }
    public void setLastName(String l) { lastName = l; }
    public String getLastName() { return lastName; }
    public void setMonthlySalary(double m) { monthlySalary = m; }
    public double getMonthlySalary() { return monthlySalary; }
}
