/**
 * Author: Zia M
 * Date: Oct 20, 2026
 * Topic: unit 5 problem set 1 question 1
 */
public class Invoice {
    private String partNumber;
    private String description;
    private int quantity;
    private double unitprice;

    public Invoice(String pn, String d, int q, double p) {
        partNumber = pn;
        description = d;
        quantity = q;
        unitprice = p;
    }

    public void setPartNumber(String p) { partNumber = p; }
    public String getPartNumber() { return partNumber; }
    public void setDescription(String d) { description = d; }
    public String getDescription() { return description; }
    public void setQuantity(int q) { quantity = q; }
    public int getQuantity() { return quantity; }
    public void setUnitPrice(double p) { unitprice = p; }
    public double getUnitPrice() { return unitprice; }

    public double getInvoiceAmount() {
        return (unitprice<0?0:unitprice) * (quantity<0?0:quantity);
    }
}
