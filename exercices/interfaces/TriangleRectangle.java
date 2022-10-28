package cours_exercices.exercices.interfaces;

public class TriangleRectangle implements IFigureGeometrique {
    private double AB = 6;
    private double BC = 8;
    private double AC = 10;

    @Override
    public double getPerimetre (){
        double perimetre = this.AB + this.BC + this.AC;
        return perimetre;
    }
    
    @Override
    public double getAire(){
        double aire = (this.AB * this.BC) / 2;
        return aire;
    }
}
