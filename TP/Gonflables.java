package TP;

public class Gonflables extends ObjetVolant {
     
    protected EtatEnveloppe etat;

    public Gonflables(String id, EtatEnveloppe etat){
        super(id);
        this.etat = etat;
    } 

    public void gonfle(){
        if(this.etat != EtatEnveloppe.GONFLE){
            this.etat = EtatEnveloppe.GONFLE;
        } else {
            System.out.println("La " + this.id + " est déjà gonflée");
        }
    }

    public void degonfle(){
        if(this.etat == EtatEnveloppe.GONFLE){
            this.etat = EtatEnveloppe.DEGONFLE;
        } else {
            System.out.println("La " + this.id + " est déjà dégonflée");
        }
    }

    @Override
    public boolean prepareVole(){
        if(this.etat == EtatEnveloppe.GONFLE){
            System.out.println("Vol possible");
            return false;
        } else {
            return true;
        }
    }
}
