/**
 * Exemple sur les collections
 */

package cours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

// Classe principale
public class Collections {
    public static void main(String[] args) {
	/// LIST
	// Creation d'une liste de type List
		List<String> maPremiereListe = new ArrayList<>(4);

        // Ajout d'un element au premier index disponible
		maPremiereListe.add("Première chaine de caractère");


        // Insert un element a l'index voulu
        maPremiereListe.add(0, "Element 1");
		

		String monElement = maPremiereListe.get(0);
		System.out.println("Mon élément à l'index 0 vaut : " + monElement);

        // Creation d'une autre liste de type List charge avec le contenu de la premiere
		List<String> chaineDeCaractereCopie = new ArrayList<>(maPremiereListe);
		// DOUBLONS :
		chaineDeCaractereCopie.add("Hello");
		chaineDeCaractereCopie.add("Hello");
		chaineDeCaractereCopie.add("Hello");
		chaineDeCaractereCopie.add("Hello");
		chaineDeCaractereCopie.add("Hello");

        // Parcour avec une boucle for intelligente
        for(String string : maPremiereListe){
			System.out.println("Dans ma première liste, j'ai " + string);
		}
        for(String string : chaineDeCaractereCopie){
			System.out.println("Dans ma deuxième liste, j'ai " + string);
		}

        // Parcour avec la methode ForEach() et une lambda
		chaineDeCaractereCopie.forEach((e) -> {
			System.out.println(e);
		});
        
        // Acces a un element de la liste via son index
		System.out.println(maPremiereListe.get(0));
        
	// Recupere le premier index de la liste ayant pour valeur "valeur 1"
	System.out.println(chaineDeCaractereCopie.indexOf("Valeur 1"));
	
	// Recupere le dernier index de la liste ayant pour valeur "valeur 1"
	System.out.println(chaineDeCaractereCopie.lastIndexOf("Valeur 1"));
	
	// Recherche de l'existence d'un element dans une liste
	System.out.println(chaineDeCaractereCopie.contains("Valeur 1"));
        
	// Taille de la liste
	chaineDeCaractereCopie.size();
        
	// Suppression de l'element a l'index 1
	chaineDeCaractereCopie.remove(1);
	
	// Suppression de l'element ayant la valeur "valeur 1"
	chaineDeCaractereCopie.remove("Valeur 1");
	
	// Suppression de tous les elements de la liste
	// chaineDeCaractereCopie.clear();
	
	/// SET
	// Definition d'une collection Set
	Set<String> setDeString = new HashSet<>();
        
        // Charge monAutreListe de type List dans monSet de type Set
	setDeString.addAll(chaineDeCaractereCopie);
        // Affichage du Set, on s'apercoit qu'il n'y a plus de doublons
        
	// Tableau de String charge
	String[] tableauString = {"Valeur 1", "Valeur 2", "Valeur 3"};

	// Conversion du tableau en liste de type List
    List<String> tableauStringasList = Arrays.asList(tableauString);

	// Affichage de la nouvelle liste
    System.out.println(tableauStringasList);

	// Creation d'une liste de type List 
        
	// Conversion en Set d'une liste d'int de type List, il n'y a plus de doublons
        
	// Ajout de la valeur 5, mais elle existe deja
	Set<Integer> setIntegers = new HashSet<>();
	setIntegers.add(Integer.valueOf(5));
	setIntegers.add(Integer.valueOf(5));
	setIntegers.add(Integer.valueOf(5));
	setIntegers.add(Integer.valueOf(5));
        
	// Creation d'une liste de type List 
        
	// Conversion en Set d'une liste de String de type List, il n'y a plus de doublons
    }
}