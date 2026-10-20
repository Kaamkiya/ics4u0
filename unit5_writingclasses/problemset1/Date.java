/*
 * Author: Zia M
 * Date: Oct 20, 2026
 * Topic: unit 5 problemset 1 question 3
 */
public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int m, int d, int y) {
        month=m;
        day=d;
        year=y;
    }

    public void setYear(int y) { year = y; }
    public int getYear() { return year; }
    public void setMonth(int m) { month = m; }
    public int getMonth() { return month; }
    public void setDay(int d) { day = d; }
    public int getDay() { return day; }

    public void displayDate() {
        System.out.printf("%d/%d/%d", month, day, year);
    }
}
