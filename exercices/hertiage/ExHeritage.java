/**
 * Exercice Heritage
 * 
 * Definissez une classe Cercle. Les objets construits a partir de cette classe
 * seront des cercles de tailles variees. En plus de la methode constructeur
 * (qui utilisera donc un parametre rayon), vous definirez les methodes surface et perimetre
 * qui devront renvoyer la surface et le perimetre du cercle.
 * Definissez ensuite une classe Cylindre derivee de la precedente.
 * Le constructeur de cette nouvelle classe comportera les deux parametres rayon et hauteur.
 * Vous y ajouterez une methode volume qui devra renvoyer le volume du cylindre
 * (rappel : volume d'un cylindre = surface de section x hauteur).
 */

package exercices.hertiage;

// Classe principale
public class ExHeritage {
    public static void main(String[] args) {
        Cercle cercle1 = new Cercle(3.2);
        System.out.println("La surface du cercle est de " + cercle1.surface() + " et son perimetre est de " + cercle1.perimetre());

        Cylindre cylindre1 = new Cylindre(4.6, 7.5);
        System.out.println("Le rayon du Cylindre est de " + cylindre1.rayon + " et sa hauteur est de " + cylindre1.hauteur);
        System.out.println("Le volume du Cylindre est de " + cylindre1.volume());
    }
}