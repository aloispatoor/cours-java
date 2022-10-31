/**
/**
 * Exercice Collections
 *
 * Creer une liste vide
 * Ajouter des elements de type String a cette liste
 * Inserer un element au debut de la liste
 * Afficher le nombre d'element contenu dans la liste
 * Afficher la liste
 * Modifier un element par une autre valeur
 * Parcourir la liste et afficher ses elements un par un
 * Supprimer un element de la liste et reafficher la liste
 */
package exercices.collection;

import java.util.HashSet;
import java.util.Set;

// Classe principale

public class ExSet {

    public static void main(String args[]) {
        // Creer un HashSet
        Set<String> setDeString = new HashSet<>();
        // Ajouter des elements dont des doublons
        setDeString.add("Doublon");
        setDeString.add("Valeur 2");
        setDeString.add("Valeur 11");
        setDeString.add("Doublon");

        // Afficher la taille du set
        System.out.println(setDeString.size());

        //Affichage du set (parcours de chaque élément)
        for(String item : setDeString){
            System.out.println(item);
        }

        // Suppression d'un élément
        setDeString.remove("Valeur 11");
       
        // Parcours avec la methode ForEach() et une lambda
        setDeString.forEach((e) -> {
            System.out.println(e);
        });
        

    }

   

}
