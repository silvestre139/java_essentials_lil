package bakery;

public class WeddingCake extends Cake {
    public String tiers;

    public WeddingCake() {
        flavor = "Almond";
    }

    public String getTiers() {
        return tiers;
    }

    public void setTiers(String tiers) {
        this.tiers = tiers;
    }
}
