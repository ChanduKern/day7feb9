class Engine {
    private String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }
}

class Car {
    private String brand;
    private Engine engine; // HAS-A relationship

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Engine Type: " + engine.getEngineType());
    }
}

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine("Petrol");
        Car c1 = new Car("Toyota", e1);

        c1.displayDetails();
    }
}
