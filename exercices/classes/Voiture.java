package exercices.classes;

// Classe voiture
public class Voiture {
    // Proprietes
    protected int id;
    protected String modele;
    protected String marque;
    protected int vitesseMax;
    protected int speed;
    protected boolean isTurnedOn;
    
    // Getters
    public int getId(){
        return this.id;
    }
    public String getModele(){
        return this.modele;
    }
    public String getMarque(){
        return this.marque;
    }
    public int getVitesseMax(){
        return this.vitesseMax;
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getIsTurnedOn(){
        return this.isTurnedOn;
    }

    
    // Setters
    public int setId(int id){
        this.id = id;
        return this.id;
    }
    public int setVitesseMax(int vitesseMax){
        this.vitesseMax = vitesseMax;
        return this.vitesseMax;
    }
    public int setSpeed(int speed){
        this.speed = speed;
        return this.speed;
    }
    public String setMarque(String marque){
        this.marque = marque;
        return this.marque;
    }
    public String setModele(String modele){
        this.modele = modele;
        return this.modele;
    }
    public boolean setIsTurnedOn(boolean isTurnedOn){
        this.isTurnedOn = isTurnedOn;
        return this.isTurnedOn;
    }
    
    // Constructeurs
    public Voiture(int id, String modele, String marque, int vitesseMax, int speed, boolean isTurnedOn){
        this.id = id;
        this.modele = modele;
        this.marque = marque;
        this.vitesseMax = vitesseMax;
        this.speed = speed;
        this.isTurnedOn = isTurnedOn;
    }
    
    // Methodes de la classe
    public boolean demarrer(){
        return setIsTurnedOn(true);
    }
    public boolean arreter(){
        return setIsTurnedOn(false);
    }

    public int rouler(){
        if(this.isTurnedOn == true){
            this.speed = setSpeed(speed++);
        }
        return this.speed = setSpeed(0);
    }

    public int stopper(){
        return this.speed = setSpeed(0);
    }

    public void showInfos(){
        System.out.println("Je vais à " + this.speed + " et ma vitesse max est de " + this.vitesseMax);
    }

}
