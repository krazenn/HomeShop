package krazenn.company.Miam;

public class Main {
    public static void main(String[] args){
        Four grandFour = new Four();
        grandFour.setCapacite(55);
        grandFour.setPuissance(200);

        Aliment cake = new Aliment();
        cake.nom = " cake au fruits";
        cake.estCuit = false;
        cake.manger();
        System.out.println("");
        grandFour.cuire(cake);
        cake.manger();
    }
}
