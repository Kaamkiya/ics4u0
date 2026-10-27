/**
 * Author: Zia M
 * Date: Oct 27, 2026
 * Topic: unit 5 problem set 4
 */
public class Company {
    private String companyName;
    private Address address;
    private int numberOfEmployees;

    public Company(String c, Address a, int e) {
        companyName=c;
        address=a;
        numberOfEmployees=e;
    }

    public void setCompanyName(String c) {companyName=c;}
    public String getCompanyName() {return companyName;}
    public void setAddress(Address s) {address=s;}
    public Address getAddress() {return address;}
    public void setNumberOfEmployees(int c) {numberOfEmployees=c;}
    public int getNumberOfEmployees() {return numberOfEmployees;}

    public boolean isLargeCompany() {
        return numberOfEmployees > 100;
    }

    @Override
    public String toString() {
        return "Company: "+companyName+"\nAddress: "+address+"\nNumber of Employees: "+numberOfEmployees+"\nLarge Company: "+isLargeCompany();
    }
}
