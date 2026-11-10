import java.util.*;
public class EmployeeTester {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("John Smith", 70000, 1987, 12, 15));
        staff.add(new Employee("Tara James", 60000, 1989, 10, 22));
        staff.add(new Employee("Tony Baker", 50000, 1990, 11, 16));
        System.out.println("Salaries before increase");
        for (Employee e:staff) System.out.println(e);
        System.out.println("Salaries after increase");
        for (Employee e:staff) {
            e.setSalary(e.raiseSalary(5));
        }
        for (Employee e:staff) System.out.println(e);
    }
}
