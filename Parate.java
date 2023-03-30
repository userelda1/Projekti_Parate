 public class Parate{
    private int amount;
    
    public Parate(int initialAmount) {
        this.amount = initialAmount;
    }
    //koment 
    int y=0;
    public int extract(int coinValue) {
        int numCoins = amount / coinValue;
        amount -= numCoins * coinValue;
        return numCoins;
    }
}

