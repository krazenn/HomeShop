
package krazenn.company.Garage;

public abstract class Vehicle {
    protected String modelName;
    private String description;
    private String manufacturer;
    private int year;
    private String color;
    private int speed;
    private int[] dimension = new int[3];
    private int weight;

    public Vehicle(String modelName, String description, String manufacturer, int year, String color, int speed, int[] dimension, int weight) {
        this.modelName = modelName;
        this.description = description;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.dimension = dimension;
        this.weight = weight;
    }

    public abstract void start();



    public abstract void stop();



    public String getModelName() {
        return modelName;
    }

    public String getDescrition() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int[] getDimension() {
        return dimension;
    }

    public int getWeight() {
        return weight;
    }
}
