/*
 * Author: Zia M
 * Date: Oct 22, 2026
 * Topic: unit 5 problemset 3
 */
import java.util.*;
public class EngineersTester {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Engineers e = new Engineers();
        System.out.print("Enter the number of engineers: ");
        int nEng = s.nextInt();
        System.out.print("Enter the company name: ");
        s.nextLine();
        String cName = s.nextLine();
        String[] eng = new String[nEng];
        double[] sal = new double[nEng];
        for (int i=0;i<nEng;i++) {
            System.out.print("Enter engineer "+(i+1)+"'s name: ");
            eng[i] = s.next();
            System.out.print("Enter yearly salary: $");
            sal[i] = s.nextDouble();
        }
        e.setCompanyName(cName);
        e.setEngineerNames(eng);
        e.setYearlySalaries(sal);
        System.out.print(e);
    }
}
