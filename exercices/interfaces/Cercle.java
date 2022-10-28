package cours_exercices.exercices.interfaces;

public class Cercle implements IFigureGeometrique {
    private double rayon = 12;

    @Override
    public double getPerimetre(){
        double diametre = this.rayon * this.rayon;
        double perimetre = Math.PI * diametre;
        return perimetre;
    }

    @Override
    public double getAire(){
        double aire = Math.PI * this.rayon * this.rayon;
        return aire;
    }

}
