package exercices.interfaces;

public class Carre implements IFigureGeometrique {
    private double cote = 6;

    @Override
    public double getPerimetre(){
        double perimetre = 4 * this.cote;
        return perimetre;
    }

    @Override
    public double getAire(){
        double aire = this.cote * this.cote;
        return aire;
    }
}
