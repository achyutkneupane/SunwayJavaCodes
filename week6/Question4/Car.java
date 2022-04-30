package week6.Question4;

/**
 * Car
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 */
public class Car {
    public void runEngine(Engine engine) {
        System.out.println("Model No.: "+engine.getModelNo());
        System.out.println("Brand: "+engine.getBrand());
        System.out.println("Price: "+engine.getPrice());
    }
    public static void main(String[] args) {
        Engine engine = new Engine(1, "BMW", 100000);
        Car car = new Car();
        car.runEngine(engine);
    }
}