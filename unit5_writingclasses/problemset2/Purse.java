/**
 * Author: Zia M
 * Date: Oct 21, 2026
 * Topic: unit 5 problemset 2 part 1
 */

public class Purse {
    private int nickel;
    private int dime;
    private int quarter;

    public Purse() {
        nickel = 0;
        dime=0;
        quarter=0;
    }

    public Purse(int n, int d, int q) {
        nickel=n;
        dime=d;
        quarter=q;
    }

    public void setNickels(int n) {
        nickel=n;
    }
    public int getNickels() {
        return nickel;
    }
    public void setDimes(int d) {
        dime=d;
    }
    public int getDimes() {
        return dime;
    }
    public void setQuarters(int q) {
        quarter=q;
    }
    public int getQuarters() {
        return quarter;
    }

    public double inDollar() {
        return (nickel*5+dime*10+quarter*25)/100.0;
    }

    public void insert(int n, int d, int q) {
        nickel+=n;
        dime+=d;
        quarter+=q;
    }

    public void remove(int n, int d, int q) {
        nickel-=n;
        dime-=d;
        quarter-=q;
    }

    public Purse addPurses(Purse p1, Purse p2) {
        return new Purse(
            p1.getNickels()+p2.getNickels(),
            p1.getDimes()+p2.getDimes(),
            p1.getQuarters()+p2.getQuarters()
        );
    }

    public Purse addToPurse(Purse that) {
        that.insert(getNickels(), getDimes(), getQuarters());
        return that;
    }

    @Override
    public String toString() {
        return String.format("Nickel: %d, Dime: %d, Quarter: %d", nickel, dime, quarter);
    }
}
