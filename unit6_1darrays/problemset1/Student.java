/**
 * Author: Zia M
 * Date: Oct 28, 2026
 * Topic: u6ps1q3
 */

public class Student {
    private String[] names;
    private double[] marks;

    public Student() {
        names=new String[0];
        marks=new double[0];
    }

    public Student(String[] n, double[] m) {
        names=n;
        marks=m;
    }

    public double average() {
        double sum=0;
        double count=0;
        for (double m:marks) {
            sum+=m;
            count++;
        }
        return sum/count;
    }

    public double[] sort() {
        double[] arr = new double[marks.length];
        for (int i=0;i<marks.length;i++) {
            arr[i]=marks[i];
        }
        int n = arr.length;
      
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                  
                    // swap temp and arr[i]
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public double median() {
        double[] m=sort();
        if (m.length%2==0) {
            return (m[m.length/2]+m[m.length/2+1])/2;
        }
        return m[m.length/2];
    }

    @Override
    public String toString() {
        String res="";
        for (int i=0;i<names.length;i++) {
            res+=names[i]+": "+marks[i]+"\n";
        }
        return res;
    }
}
