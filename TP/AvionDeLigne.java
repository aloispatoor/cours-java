package TP;

public class AvionDeLigne extends Avions {

    public AvionDeLigne(String id, double carburant){
        super(id, carburant);
    }

    public void embarquePassager(){
        System.out.println("Les passagers embarquent");
    }
    public void debarquePassager(){
        System.out.println("Les passagers débarquent");
    }
}
