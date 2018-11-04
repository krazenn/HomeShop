package krazenn.company.Paris;

public class Taxi implements MoyenDeLocomotion {
    @Override
    public void deplace(String adress) {
        System.out.println("Je suis un Taxi et je vais à l'adresse : " + adress);
    }
}
