/*
* Exercice Tableaux
* 
* 1. Ecrire dans un tableau les valeurs suivantes : 1, 1, 2, 3, 5, 8, 13, 21
* 2. Creer un autre tableau ayant un element de plus que le premier initialiser a 0.
* 3. Afficher les elements du premier tableau.
* 4. Afficher les elements du 2eme tableau.
* 5. Copier les valeurs du premier tableau dans le second et inserer une valeur aribitraire a la 3eme position.
* 6. Afficher le tableau apres l'operation d'insertion.
*/
 
package exercices.tableaux;

// Classe principale
public class ExTableaux {
    public static void main(String[] args) {
        // Afficher les elements du tableau original
        int[] tableauOriginel = new int[]{1, 1, 2, 3, 5, 8, 13, 21};
        
        // Afficher les elements du nouveau tableau
        for(int item : tableauOriginel){
            System.out.println(item);
        }
        
        // Copie des elements du premier tableau
        int[] tableauRemix = new int[tableauOriginel.length + 1];
        
      
        // et insertion d'un element a la 3eme position
        /* tableauRemix[0] = 1;
        tableauRemix[1] = 1;
        tableauRemix[2] = 14;
        tableauRemix[3] = 2;
        tableauRemix[4] = 3;
        tableauRemix[5] = 5;
        tableauRemix[6] = 8;
        tableauRemix[7] = 13;
        tableauRemix[8] = 21; */
        for(int i = 0; i < tableauOriginel.length; i++){
            tableauRemix[i] = tableauOriginel[i];
        }
        tableauRemix[2] = 14;
        
        // Afficher le tableau apres l'operation d'insertion
        for(int item : tableauRemix){
            System.out.println(item);
        }
        
        // Messaged de fin
        System.out.println("Bah du coup, fin ! ");
    }
}