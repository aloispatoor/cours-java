package cours_exercices.exercices.interfaces;

public class Rectangle implements IFigureGeometrique {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double getPerimetre(){
        double perimetre = (this.longueur + this.largeur) * 2;
        return perimetre;
    }

    @Override
    public double getAire(){
        double aire = this.longueur * this.largeur;
        return aire;
    }
}
