public class CompanyTester {
    public static void main(String[] args) {
        Address a = new Address("Toronto", "", "");
        Company c = new Company("Tech Solutions", a, 5);
        System.out.printf("Company: %s\nCity: %s\n", c.getCompanyName(), c.getAddress().getCity());
        System.out.println("Updated company information: ");
        Address b = new Address("Ottawa", "123 Raja Sadak", "M5H 1A1");
        c.setCompanyName("Future Technologies");
        c.setAddress(b);
        c.setNumberOfEmployees(80);
        System.out.println(c);
    }
}
