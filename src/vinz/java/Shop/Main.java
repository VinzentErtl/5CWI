package vinz.java.Shop;



public class Main {
    public static void main(String[] args) {
        CaR c1 = new CaR("red", "Supercar");
        Bike b1 = new Bike("green", "Superbike2");

        Gui gui = new Gui();
        gui.addProduct(c1);
        gui.addProduct(b1);
        gui.addProduct(new Cycle());

        gui.showTotalStockValue();
        gui.run();
    }
}
