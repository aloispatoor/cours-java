package cours_exercices.exercices.hertiage;

// Classe Cylindre
public class Cylindre extends Cercle{
    // Propriete
    public double hauteur;
    
    // Constructeur
    public Cylindre(double rayon, double hauteur){
        super(rayon);
        this.hauteur = hauteur;
    }
    
    // Getters
    public double getHauteur(){
        return this.hauteur;
    }
    
    // Setters
    public double setHauteur(double hauteur){
        this.hauteur = hauteur;
        return this;
    }
    
    // Methode
    public double volume(){
        return surface() * this.hauteur;
    }

    // La méthode de surface sur cylindre est != de celle du cercle, alors : 
    @Override
    public double surface(){
        return super.surface() * 2 + super.perimetre() * this.hauteur;
    }

}