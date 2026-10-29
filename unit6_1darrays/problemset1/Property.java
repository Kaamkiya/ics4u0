/**
 * Author: Zia M
 * Date: Oct 28, 2026
 * Topic: u6ps1q2
 */
public class Property {
    private int available=4;
    private int[] bedroom;
    private int[] washroom;
    private String[] type;

    public Property() {
        available=0;
    }

    public Property(int[] b, int[] w, String[] t) {
        bedroom=b;
        washroom=w;
        type=t;
        available=t.length;
    }

    @Override
    public String toString() {
        String res= "Available properties: "+available+"\n";
        for (int i=0;i<available;i++) {
            res+=String.format("Bedroom: %d, Washroom: %d, Property type:%s\n", bedroom[i], washroom[i], type[i]);
        }
        return res;
    }
}
