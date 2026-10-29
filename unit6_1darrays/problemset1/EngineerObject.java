/**
 * Author: Zia M
 * Date: Oct 28, 2026
 * Topic: u6p1q1
 */
public class EngineerObject {
    public static void main(String[] args) {
        Engineer[] e = new Engineer[4];
        e[0] = new Engineer("Electrical Engineer", 120000, 2018);
        e[1] = new Engineer("Mining Engineer", 150000, 2020);
        e[2] = new Engineer("Mechanical Engineer", 130000, 2010);
        e[3] = new Engineer("Computer Engineer", 180000, 2019);
        for (Engineer q:e) {
            System.out.println(q);
        }
    }
}
