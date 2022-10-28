package TP;

public class Dirigeable extends Gonflables {
    
    private double carburant;


    public Dirigeable(String id, double carburant, EtatEnveloppe etat){
        super(id, etat);
        this.carburant = carburant;
    }
}
