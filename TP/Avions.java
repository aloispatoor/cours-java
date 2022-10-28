package TP;

public class Avions extends ObjetVolant {

    protected double carburant;

    public Avions(String id, double carburant){
        super(id);
        this.carburant = carburant;
    }

    @Override
    public boolean prepareVole(){
        if(this.carburant > 0){
            System.out.println("Préparation terminée");
            return false;
        } else {
            return true;
        }
    }
}
