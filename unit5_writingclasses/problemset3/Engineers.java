/*
 * Author: Zia M
 * Date: Oct 22, 2026
 * Topic: unit 5 problemset 3
 */
import java.util.*;

public class Engineers {
    private String companyName;
    private String[] engineerNames;
    private double[] yearlySalaries;

    public void setCompanyName(String s) {
        companyName = s;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setEngineerNames(String[] s) {
        engineerNames=s;
    }
    public String[] getEngineerNames() {
        return engineerNames;
    }
    public void setYearlySalaries(double[] d) {
        yearlySalaries=d;
    }
    public double[] getYearlySalaries() {
        return yearlySalaries;
    }

    public double salaryRange() {
        double biggest=0, smallest=Double.MAX_VALUE;
        for (int i=0;i<yearlySalaries.length;i++) {
            if (yearlySalaries[i] < smallest) smallest = yearlySalaries[i];
            if (yearlySalaries[i] > biggest) biggest = yearlySalaries[i];
        }

        return biggest-smallest;
    }

    @Override
    public String toString() {
        return "Company: "+companyName+
            "\nEngineers: "+Arrays.toString(engineerNames)+
            ", Salaries: "+Arrays.toString(yearlySalaries)+
            "\nSalary Range: $"+String.format("%.2f", salaryRange())+"\n";
    }
}
