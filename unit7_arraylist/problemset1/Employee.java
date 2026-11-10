/*
 * Author: Zia M
 * Date: Nov 10, 2026
 * Topic: Employee class
 */
import java.util.*;

public class Employee {
    private String name;
    private int salary; 
    private int year;
    private int month;
    private int day;

    public Employee(String n, int s, int y, int m, int d) {
        name=n;
        salary=s;
        year=y;month=m;day=d;
    }

    public void setName(String n) {name=n;}
    public String getName() {return name;}
    public void setSalary(int n) {salary=n;}
    public int getSalary() {return salary;}
    public void setYear(int n) {year=n;}
    public int getYear() {return year;}
    public void setMonth(int n) {month=n;}
    public int getMonth() {return month;}
    public void setDay(int n) {day=n;}
    public int getDay() {return day;}

    public int raiseSalary(int percentage) {
        return (int)(salary + (salary*(percentage/100.0)));
    }

    public String toString() {
        return String.format("Name: %s, Salary: $%d, HireDay: %d/%d/%d", name, salary, year, month, day);
    }
}
