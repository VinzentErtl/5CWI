package vinz.java.Shop;

public class Cycle implements Product{
    private double price = 500;

    @Override
    public String getName() {
        return"Cycle";
    }

    @Override
    public double getPrice() {
        return price;
    }
    
}
