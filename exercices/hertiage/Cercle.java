package cours_exercices.exercices.hertiage;

// Classe Cercle
public class Cercle{
    // Propriete
    protected double rayon;

    // Constructeur
    public Cercle(double rayon){
        this.rayon = rayon;
    }
    
    // Getters
    public double getRayon(){
        return this.rayon;
    }
    
    // Setters
    public double setRayon(double rayon){
        this.rayon = rayon;
        return this;
    }
    
    // Methodes
    protected double surface(){
        double doubleRayon = this.rayon * this.rayon;
        double resultSurface = Math.PI * doubleRayon;
        return resultSurface;
    }

    protected double perimetre(){
        double diametre = this.rayon * 2;
        double resultPerimetre = Math.PI * diametre;
        return resultPerimetre;
    }

}
