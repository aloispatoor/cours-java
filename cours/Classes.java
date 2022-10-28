/**
 * Exemple sur les classes
 */

package cours;

// Definition d'une classe avec visibilite limitee au package
class Truc{
    // Attribut public
    public String machin;
    
    // Emploi de this dans une methode de la classe
    // Methode publique
    public String getMachin(){
        return this.machin;
    }
    // Methode private
    private String setMachin(String bidule){
        this.machin = bidule;
        return machin;
    }
    
}
    

// Classe publique Classes
public class Classes {
    public String nom;
    String nomPackage;
    protected String nomProtected;
    private String nomSecret;
    
    public Classes(){
        System.out.println("Le constructeur est appelé");
        this.nom = "Nouveau nom";
    }
    
    private String getNomSecret(){
        return this.nomSecret;
    }
    
    // Methode avec valeur de retour
    public String getNom(){
        return this.nom;
    }
    // Methode sans valeur de retour
    public void afficherNom(){
        System.out.println(this.nom);
    }

    
    
    // Methode avec retour et parametre
    public Classes(String arg1){
        this.nomSecret = arg1;
    }

    // Methode principale
    public static void main(String[] args){
        // Creation d'un nouvel objet de type Classes nomme mc
        Classes mc = new Classes();
        
        System.out.println(mc.nomSecret);
        
        // Appel de la methode sansRetour
        mc.afficherNom();
        
        // Appel de la methode avecRetour
        
        // Appel d'une methode avec retour et parametre 
        
        // Creation d'un objet de la classe uneClasse nomme uc
        Classes uc = new Classes();
        uc.nomSecret = "Nouveau Nom Secret";
        System.out.println(uc.nomSecret);
    }
        
        
        
        
        
    
        // Appel de l'attribut public d'une classe
        
        // Appel de la methode cube de la classe uneClasse
        
        // Appel de la methode carre de la classe uneClasse impossible, car elle est privee
        
        // Appel de la methode addition de la classe uneClasse
}