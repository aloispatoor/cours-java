/**
 * Exemple sur les tableaux
 */

package cours;

// Classe principale
public class Tableaux {
    public static void main(String[] args) {
	// Declaration d'un tableau sans l'alimenter
        String[] tabDeStrings = new String[2]; //Tableau de 2 strings
        
        // Affectation des valeurs a un tableau
	// Remarque : le premier indice du tableau est 0
        int[] tab = new int[3];
        tab[0] = 12;
        tab[1] = 19;

	// Affichage d'une valeur d'un tableau
        System.out.println("La valeur de l'index 0 du tableau est : " + tab[0]);
        
	// Affichage d'une valeur non attribue d'un tableau (cela est egale a null)
        tabDeStrings[1] = "Salut";
        System.out.println("La valeur de l'index 0 du tableau de Strings est : " + tabDeStrings[0]);
        System.out.println("La valeur de l'index 1 du tableau de Strings est : " + tabDeStrings[1]);
        
	// Vouloir acceder a un index non inclus dans un tableau genere une exception
        String valeurMystere = tabDeStrings[2];
	
	// Declaration d'un tableau sans declarer son nombre d'elements et alimente directement
        String[] tableauDirectementRempli = {"valeur1", "valeur2", "valeur3"};
        
        // Parcours du tableau pour afficher les elements
        for(int i = 0; i < tabDeStrings.length; i++){
            System.out.println("Dans la boucle, la valeur de l'élément : " + i + " du tableau de Strings est : " + tabDeStrings[i]);
        }
        for(String item : tabDeStrings){
            System.out.println("Dans la boucle intelligente, la valeur de l'élément : " + item);
        }
        
        // Tableau a deux dimensions
        String[][] stringMatrix = new String[4][7];
        
        // Affichage des dimensions du tableau
        System.out.println(stringMatrix[2][2]);
        
        // Parcours du tableau pour afficher le contenu.
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 7; j++){
                stringMatrix[i][j] = "Ligne " + i + ", colonne " + j;
                System.out.println("La valeur du tableu à 2 dimensions vaut : " + stringMatrix[i][j]);
            }
        }
        
        for(String[] ligne : stringMatrix){
            for(String celulle : ligne){
                System.out.println("Cellule vaut : " + celulle);
            }
        }
    }
}