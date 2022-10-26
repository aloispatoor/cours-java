/**
 * Exercices methodes
 * 
 * 1. Definir une methode maximum(n1, n2, n3) qui renvoi le plus grand 
 * des 3 nombres n1, n2, n3 fourni en arguments.
 * exemple : maximum(2, 15, 5) doit afficher : 15
 * 
 * 2. Ecrire une fonction cube qui retourne le cube de son argument.
 * Ecrire une fonction volumeSphere qui calcule le volume d'une sphere de rayon r
 * fourni en argument et qui utilise la fonction cube. 
 */

package cours_exercices.exercices.methodes;

// Classe principale
public class ExMethodes {
    // Methode maximum
    static int maximum(int[] n){
        // int max = Math.max(Math.max(n1, n2), n3);
        int max = n[0];
        
        for(int i = 1; i < n.length; i++){
            if(n[i] > max){
                max = n[i];
            }
        }
        return max;
    }

    // Methode cube
    static double cube(double c){
        double resultCube = c * c * c;
        return resultCube;
    }
    
    // Methode volume
    static double volumeSphere(double r){
        double rCube = cube(r);
        double volume = ((4 * Math.PI) * rCube) / 3;
        return volume;
    }
    
    // Methode principale
    public static void main(String[] args) {
        int[] n = {18, 7, 15};
        int theMax = maximum(n);
        System.out.println("Le nombre le plus grand est " + theMax);
        
        double exCube = cube(7);
        System.out.println("Le cube de 7 est " + exCube);
        
        double exVolume = volumeSphere(45);
        System.out.println("Le volume de la sphere au rayon 45 est " + exVolume + " m3");
    }
}