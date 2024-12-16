package vinz.java.Shop;

public class CaR implements Product{
    private String color;
    private String name;
    private double price = 20000;

    public CaR(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
