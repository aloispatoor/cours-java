// Faire une collection d'Integer en instanciant un TreeSet.
// ajouter des entiers, et afficher la liste : vérifier que tout est trié. 
// Implémenter un Comparator à fournir à la construction du TreeSet pour trier votre Set dans l'ordre inverse.
// (créer une nouvelle classe qui implémente Comparator).

package exercices.collection;

import java.util.Set;
import java.util.TreeSet;

public class ExTreeSet {
    public static void main(String[] args) {
        Set<Integer> setInteger = new TreeSet<>(new ExComparator());
        setInteger.add(4);
        setInteger.add(12);
        setInteger.add(27);
        setInteger.add(10);
        setInteger.add(85);

        for(Integer i : setInteger){
            System.out.println("J'itère sur la valeur " + i);
        }
    }
}
