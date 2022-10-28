/**
 * Exemple sur les enuméartions
 */

package cours_exercices.cours;

// Enumeration
// Avec enum on ne cree pas autant de constante qu'il y a de jours.
// On cree un ensemble de constantes affectees a un seul nom.
public enum Valeurs{
    ETAT_ACTIF, ETAT_INACTIF, ETAT_INCONNU;
}



// Classe sans enumerations (voire ValeursFixes.java)
    // Attributs

    // Methode

// Classe principale
public class Enumerations {
    // Methode

    // Methode principale
    public static void main(String[] args) {
        System.out.println(ValeursFixes.VALEUR_1);

        Valeurs etat = Valeurs.ETAT_ACTIF;
        if(etat == Valeurs.ETAT_ACTIF){
            System.out.println("Etat actif");
        }else if(etat == Valeurs.ETAT_INACTIF){
            System.out.println("Etat inactif");
        }else if(etat == Valeurs.ETAT_INCONNU){
            System.out.println("Etat inconnu");
        }
        
    }
}