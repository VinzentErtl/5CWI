package vinz.java.car;

public class Gui {
    public static void main(String[] args) {
        Engine e1 = new Engine();
        Car c1 = new Car("red", e1);
        
        try {
            c1.startEngine();
        } 
        catch (CarException e) {
            // TODO: handle exception
            System.out.println("Car error");
        }
        catch (EngineException e) {
            // TODO: handle exception
            System.out.println("Engine error");
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("DU Netter");
        }
    }
}
