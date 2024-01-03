package bakery;

public class Cake {

    public String flavor;
    public double price;

    public Cake() {
        flavor = "Vanilla";
        price = 9.99;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
