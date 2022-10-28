/**
 * Exemple sur les expressions lambda
 */

package cours;

// Interface fonctionnelle (Voire OperationUnitaire)

// Classe principale
public class Lambda {
    // Methode statique appelant la methode calc de notre objet fourni en parametres
    
    // Methode principale
    public static void main(String args[]) {
        // Definition des objets implementant l'interface Operation via une lambda
        
        // Avec la declaration de type
        
        // Sans declaration de type, ni return, ni accolade
        
        // Avec 'return' et les accolades
        OperationUnitaire operationLambda  = (double d) -> {return d * d * d;};
        afficheOp(operationLambda, 7);

        // Sans 'return' et sans les accolades

        // Appel de la methode statique et transmission des objet en parametre a cette methode
    }

    static void afficheOp(OperationUnitaire operation, double value){
        System.out.println(operation.effectuerOperation(value));
    }
}