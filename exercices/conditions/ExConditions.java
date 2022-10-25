/*
 * Exercice conditions
 * 
 * 1. Chercher le plus grand des 3 nombres saisie par l'utilisateur
 * 2. Afficher sur les nombres saisie sont pairs ou impairs
 * 3. Demander a l'utilisateur de saisir le numero d'un mois de l'annee
 * et afficher le nombre de jours correspondant au mois choisi (28/29) pour fevrier
 * indiquer un message d'erreur si le numero de mois n'est pas compris entre 1 et 12.
 */

package cours_exercices.exercices.conditions;

// Classe principale

import java.util.Scanner;

public class ExConditions {
    public static void main(String[] args) {
        // Declarations / definitions des variables
        var keyb = new Scanner(System.in);
        
        System.out.println("Entrez chiffre 1 : ");
        int num1 = keyb.nextInt();
        System.out.println("Entrez chiffre 2 : ");
        int num2 = keyb.nextInt();
        System.out.println("Entrez chiffre 3 : ");
        int num3 = keyb.nextInt();
        
        // Fournir les donnees d'entree
        
        // Chercher le maximum
                // si num1 > num2 et num1 > num3
                if (num1 > num2 && num1 > num3){
                    System.out.println(num1 + "est le plus grand");
                }

                // si num1 > num2 mais num1 <= num3
                else if (num1 > num2 && num1 <= num3){
                    System.out.println(num3 + "est le plus grand");
                }

                // Si num1 <= num2 et num2 > num3
                else if (num1 <= num2 && num2 > num3){
                    System.out.println(num2 + "est le plus grand");
                }

                // si num1 <= num2 et num2 <= num3
                else {
                    System.out.println(num3 + "est le plus grand");
                }
         
        // Afficher le resultat
        
        // Afficher si num1 est pair ou impair
        if (num1 % 2 == 0){
            System.out.println(num1 + "est pair");
        } else {
            System.out.println(num1 + "est impair");
        }
        
        // Fournir les donnees d'entree
        System.out.println("Entrez un mois : ");
        int month = keyb.nextInt();
        
        if (month < 1 || month > 12){
            System.out.println("Erreur, c'est pas un mois, ça, enfin !");
            month = keyb.nextInt();
        } else {
            System.out.println("Vous avez entré le mois " + month);
        }
        
        String result = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> "Il y a 31 jours dans ce mois";
            case 4, 6, 9, 11 -> "Il y a 30 jours dans ce mois";
            default -> "C'est le mois de février";
        }; 
        
        // Afficher le resultat
        System.out.println(result);
                
        // Fermer les ressources
        keyb.close();
    }
}