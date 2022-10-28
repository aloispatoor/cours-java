/**
 * Exemple sur l'abstraction et le polymorphisme
 */

package cours;

// Classe abstraite Vehicule
// car on declare une methode abstraite dans la classe
public abstract class Vehicule{

    protected int compteurKilometrique;
    
    public abstract void rouler();

}
// Classe Voiture qui herite de la classe Vehicule
public class Voiture extends Vehicule{

    @Override
    public void rouler() {
        this.compteurKilometrique++;
        System.out.println("Je transporte des passagers.");
    }
}

// Classe Camion qui herite de la classe Vehicule
public class Camion extends Vehicule{

    @Override
    public void rouler() {
        this.compteurKilometrique++;
        System.out.println("Je transporte des marchandises.");
    }
}

// Classe principale
public class AbstractionPolymorphisme {
    public static void main(String[] args) {
        
        // Appel de la methode rouler() possible 
        // car rouler() a ete declaree dans Vehicule.
        // A l'execution, c'est la methode definie 
        // sur l'objet reel qui est appelee ! -> Polymorphisme.
        Voiture voiture = new Voiture();
        voiture.rouler();
        
        Vehicule vehiculeVoiture = voiture;
        // Appel de la methode definie dans la classe abstraite Vehicule
        // mais executee sur la classe voiture (polymorphisme).
        vehiculeVoiture.rouler();
        
        Camion camion = new Camion();
        camion.rouler();
    
    }
}
