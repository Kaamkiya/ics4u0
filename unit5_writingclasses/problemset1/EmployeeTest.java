/*
 * Author: Zia M
 * Date: Oct 20, 2026
 * Topic: unit 5 problemset 1 question 2
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee a = new Employee("Jane", "Doe", 1404);
        Employee b = new Employee("John", "Doe", 1403);
        System.out.printf("Employee A: $%.2f\n", a.getMonthlySalary());
        System.out.printf("Employee B: $%.2f\n", b.getMonthlySalary());

        a.setMonthlySalary(a.getMonthlySalary()*1.1);
        b.setMonthlySalary(b.getMonthlySalary()*1.1);
        System.out.printf("Employee A after raise: $%.2f\n", a.getMonthlySalary());
        System.out.printf("Employee B after raise: $%.2f\n", b.getMonthlySalary());
    }
}
