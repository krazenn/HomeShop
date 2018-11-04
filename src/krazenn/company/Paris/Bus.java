package krazenn.company.Paris;

public class Bus implements MoyenDeLocomotion {
    @Override
    public void deplace(String adress) {
        System.out.println("Je suis un Bus et je vais à l'adresse : " + adress);
    }
}
