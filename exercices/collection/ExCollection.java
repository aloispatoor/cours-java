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

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

// Classe principale
public class ExCollection {
    public static void main(String args[]) {
        // Creer un ArrayList
        List<String> listeDeStrings = new ArrayList<>();
        
        // Ajouter des elements a l'ArrayList
        listeDeStrings.add("Deuxième String");
        listeDeStrings.add("Troisème String");
        listeDeStrings.add("Quatrième String");
        
        // Insertion d'un element au debut de la liste
        listeDeStrings.add(0, "String index 0");

        // Afficher la taille de la liste
        System.out.println(listeDeStrings.size());
        
        // Afficher l'ArrayList
        System.out.println(listeDeStrings);

        // Modification d'un element de la liste
        listeDeStrings.set(3, "Changement String");
        
        // Parcour de la liste
        for (String string : listeDeStrings){
            System.out.println(string);
        }
        
        // Supprimer des elements de l'ArrayList
        listeDeStrings.remove(2);
        
        // Afficher l'ArrayList
        System.out.println(listeDeStrings);
        
        // Parcour avec la methode ForEach() et une lambda

        // listeDeStrings.forEach((item) -> {System.out.println(item.getIdentifiant());});

        // List<Object> listedObjets = new ArrayList<>();
        // for(Iterator<Object> iterator = listedObjets.iterator(); iterator.hasNext();){
        //     Object itemDeListe = iterator.next();
        //     System.out.println("Je suis dans Iterator et je boucle : " + itemDeListe.getIdentifiant());
        //     if(itemDeListe.getIdentifiant().equals("String index 0")){
        //         iterator.remove();
        //     }
        // }

        listeDeStrings.removeIf((x) -> x.length()>3);

    }
}