package krazenn.company.Garage;

public class Bike extends Vehicle {
    public Bike(String modelName, String description, String manufacturer, int year, String color, int speed, int[] dimension, int weight) {
        super(modelName, description, manufacturer, year, color, speed, dimension, weight);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
