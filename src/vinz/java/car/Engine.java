package vinz.java.car;

public class Engine {

    public void start() throws EngineException {
        System.out.println("engine started");
        boolean hasError = true;

        if (hasError) {
            throw new EngineException("engine error");
        }
    }
}