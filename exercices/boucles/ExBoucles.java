/**
 * Exercice Boucles
 * 
 * 1. Afficher tous les nombres entiers de 1 a 20 en utilisant la boucle for et while.
 * 2. Afficher les 20 premiers resultats d'une table de multiplication
 * sous la forme : 1 x 5 = 5 etc...
 * 3. Afficher les tables de multiplication pour les nombres de 5 a 10 inclus.
 */

package cours_exercices.exercices.boucles;

// Classe principale
public class ExBoucles {
    public static void main(String[] args) {
        // Affichage avec la boucle for
        for(int i = 1; i <= 20; i++){
            System.out.println(i);
        }
        
        // Affichage avec la boucle while
        int j = 1;
        while(j <= 20){
            System.out.println(j);
            j++;
        }
        
        // Table de multiplication
        for(int num1 = 1; num1 <= 20; num1++){
            for(int num2 = 3; num2 <= 3; num2++){
                int table = num1 * num2;
                System.out.println(num1 + "x" + num2 + "=" + table);
            } 
        }
        
        // Table de multiplication des nombres 5 a 10 inclus
        for(int num1 = 5; num1 <= 10; num1++){
            for(int num2 = 5; num2 <= 10; num2++){
                int table = num1 * num2;
                System.out.println(num1 + "x" + num2 + "=" + table);
            } 
        }
    }
}