package krazenn.company.Garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    private int door;
    private int litrePer100km;
    private String motor;
    private List<String> option = new ArrayList<String>();

    public Car(String modelName, String description, String manufacturer, int year, String color, int speed, int[] dimension, int weight, int door, int litrePer100km, String motor, List<String> option) {
        super(modelName, description, manufacturer, year, color, speed, dimension, weight);
        this.door = door;
        this.litrePer100km = litrePer100km;
        this.motor = motor;
        this.option = option;
    }

    @Override
    public void start() {
        System.out.println("Je suis " + modelName + " je consomme " + litrePer100km + "l au 100km et he démarre");
    }

    @Override
    public void stop() {
        System.out.println("Je suis " + modelName + " j'arrête mon moteur " + motor);
    }

    public void startHeadLight(){
        System.out.println("J'allume mes phares");
    }

    public void openTrunk(){
        System.out.println("J'ouvre mon coffre");
    }

    public int getDoor() {
        return door;
    }

    public int getLitrePer100km() {
        return litrePer100km;
    }

    public String getMotor() {
        return motor;
    }

    public List<String> getOption() {
        return option;
    }
}
