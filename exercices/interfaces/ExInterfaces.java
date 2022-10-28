/**
 * Exercice Interface
 * 
 * Ecrire une interface nommee IFigureGeometrique
 * cette interface doit avoir la declaration de 2 methodes :
 * getAire() et getPerimetre()
 * 
 * Ecrire les classes Carre, Cercle, Rectangle et TriangleRectangle implementant l'interface
 * 
 * Ecrire une classe principale appelant
 */

package exercices.interfaces;

// Classe principale
public class ExInterfaces {
    public static void main(String... args) {

        IFigureGeometrique cercle = new Cercle();
        System.out.println("Le perimetre du cercle est de " + cercle.getPerimetre());
        System.out.println("L'aire du cercle est de " + cercle.getAire() + "\n");

        IFigureGeometrique carre = new Carre();
        System.out.println("Le perimetre du carre est de " + carre.getPerimetre());
        System.out.println("L'aire du carre est de " + carre.getAire() + "\n");

        //Rectangle a un constructeur
        IFigureGeometrique rectangle = new Rectangle(14, 25);
        System.out.println("Le perimetre du rectangle est de " + rectangle.getPerimetre());
        System.out.println("L'aire du rectangle est de " + rectangle.getAire() + "\n");

        IFigureGeometrique triangle = new TriangleRectangle();
        System.out.println("Le perimetre du triangle est de " + triangle.getPerimetre());
        System.out.println("L'aire du triangle est de " + triangle.getAire() + "\n");
    }
}