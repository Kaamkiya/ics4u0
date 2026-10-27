/**
 * Author: Zia M
 * Date: Oct 27, 2026
 * Topic: unit 5 problem set 4
 */
public class Address {
    private String city;
    private String street;
    private String postalCode;

    public Address(String c, String s, String pc) {
        city=c;
        street=s;
        postalCode=pc;
    }

    public void setCity(String c) {city=c;}
    public String getCity() {return city;}
    public void setStreet(String s) {street=s;}
    public String getStreet() {return street;}
    public void setPostalCode(String c) {postalCode=c;}
    public String getPostalCode() {return postalCode;}

    @Override
    public String toString() {
        return street+", "+city+", "+postalCode;
    }
}
