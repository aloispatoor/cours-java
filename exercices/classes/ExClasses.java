/**
 * Exercices Classes
 * 
 * Creer une classe Voiture ayant les proprietes suivantes :
 * un identifiant, la marque, le modele, la couleur, la vitesse maximum
 * et comme methodes : demarrer, rouler, stopper et arreter
 * mettre de message si la voiture est deja demarrer etc ...
 * puis dans la classe principale, declarer des objets de la classe Voiture
 * et faite les demarrer puis rouler, etc ...
 * Faire une methode infos qui donnera les informations sur l'objet et son etat.
 */

package cours_exercices.exercices.classes;



// Classe principale
public class ExClasses {
    public static void main(String[] args) {
       // Definitions des objets
       Voiture peugeot206 = new Voiture(1, "206", "Peugeot", 180, 0, true);
       Voiture audiA3 = new Voiture(2, "A3", "Audi", 240, 0, false);
       Voiture nissanMicra = new Voiture(3, "Micra", "Nissan", 220, 80, true);
       
       // Utilisation des objets
        audiA3.demarrer();
        peugeot206.rouler();
        nissanMicra.stopper();

        audiA3.showInfos();
        peugeot206.showInfos();
        nissanMicra.showInfos();
    }
}