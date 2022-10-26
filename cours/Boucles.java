/**
 * Exemple sur les boucles, continue et break
 */

package cours_exercices.cours;

// Classe principale
public class Boucles {
    public static void main(String[] args) {
	// Boucle for
	for (int cpt = 0; cpt < 3; cpt++){
            System.out.println(cpt);
        }
        
        // Saut de ligne
        System.out.println();
	
	// Boucle do ... while
        int cpt = 0;
        do {
            System.out.println(cpt);
            cpt++;
        } while (cpt < 10);
        
        // Saut de ligne
        System.out.println();
        
        // Boucle while
        while (cpt != 0){
            // utilisation de continue
            if (cpt == 0){
                cpt--;
                continue;
            }
            System.out.println(cpt);
            cpt--;
            
            // Utilisation de break
            if(cpt == 3){
                break;
            }
        }

            
        // Saut de ligne
        System.out.println();
        
        // Boucle "intelligente"
        int[] liste = {1, 2, 3};
        
        for (int item : liste){
            System.out.println(item);
        }
    }
}