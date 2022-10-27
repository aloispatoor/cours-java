/**
 * Exemple sur l'heritage
 */

package cours_exercices.cours;

// Classe Compte simple
public class Compte{

    protected void afficheCompte(){
        System.out.printnl("Je suis un compte");
    }

    protected int calculeInterets(){
        // ici calculs de fou
        return 0;
    }

    // Proprietes
    protected int motant;
    
    // Constructeur
    
    // Getters
    
    // Setters
    public int setMontant(int montant){
        this.montant = montant;
        return this;
    }
}

// Classe CompteBancaire heritant de Compte
public class CompteBancaire extends Compte{

    public void afficheCompteBancaire(){
        afficheCompte();
        System.out.println(this.montant());
    }

    @Override
    public int calculeInterets(){
        int interetsParents = super.calculeInterets();
        return interetsParents + 5;
    }
    // Propriete
    
    // Constructeurs
        // Appel le constructeur de la classe mere

    // Getters
    
    // Setters
}

// Classe principale
public class Heritage {
    public static void main(String[] args) {

        Compte compte = new Compte();
        System.out.println(compte.calculeInterets());

        CompteBancaire compteBancaire = new CompteBancaire();
        System.out.println(compteBancaire.calculeInterets());
        compteBancaire.afficheCompteBancaire();
        compteBancaire.afficheCompte();

        Compte compteBancaireCache = new CompteBancaire();
        System.out.println(compteBancaireCache.calculeInterets()); /* calculeInterets() de CompteBancaire ! */
    }
}