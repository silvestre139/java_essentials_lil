package bakery;

public class BirthdayCake extends Cake{

    public int candles;

    public BirthdayCake(){
        flavor = "Chocolate";
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
