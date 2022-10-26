/**
 * Exemple sur les methodes
 */

package cours_exercices.cours;

// Import de la classe BigInteger

// Classe principale
public class Methodes {
    // Methode principale
    public static void main(String[] args){
        int varFactoriel = factoriel(4);
        System.out.println("Le résultat de la méthode factorielle est " + varFactoriel);
        
        useless();
        argNoReturn("Hello");
        sevArgNoReturn(6, "Hello encore");
        
    }
    // Methode pour calculer factoriel n avec des grandes valeurs.
    // Factoriel(n) = 1 * 2 * 3... * n
    static int factoriel(int n){
        if(n <= 0){
            return 1;
        }
        
        int factorielle = 1;
        // Si n > 1, on boucle et on decremente n � chaque fois
        // Multiplication de f par n
        for(int i = 1; i <= n; i++){
            factorielle *= i;
            // équivaut à factorielle = factorielle * i;
        }
        // Affiche la valeur de factorielle n, puis la longuer du nombre
        return factorielle;
    }
        

        

    // Methode sans parametre et ne retournant pas de valeur.
    static void useless(){
        System.out.println("Une methode sans paramètre qui ne renvoie rien");
        return;
    }
    
    // Methode avec un parametre et ne retournant pas de valeur.
    static void argNoReturn(String character){
        System.out.println(character);
        return;
    }
    
    // Methode avec plusieurs parametres et ne retournant pas de valeur.
    static void sevArgNoReturn(int param1, String param2){
        param1 *= 5;
        System.out.println(param2);
        return;
    }
    
    // Methode avec parametre et retournant une valeur.
    
    
}