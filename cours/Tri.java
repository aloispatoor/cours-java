package cours;

import java.util.Set;
import java.util.TreeSet;
import TP.Dirigeable;

public class Tri {
    public static void main(String[] args) {

        Set<Integer> trie = new TreeSet<>(new SuperComparator());
        trie.add(1);
        trie.add(2);
        trie.add(3);
        trie.add(4);
        trie.add(5);

        for(Integer i : trie){
            System.out.println("J'itère sur la valeur " + i);
        }

        Set<Dirigeable> dirigeables = new TreeSet<>(new DirigeableComparator());
        Set<Dirigeable> dirigeables2 = new TreeSet<>((o1, o2) -> o1.getIdentifiant().compareTo(o2.getIdentifiant()));
        dirigeables.add(new Dirigeable("aaa"));
        dirigeables.add(new Dirigeable("zzz"));
        dirigeables.add(new Dirigeable("ccc"));
    }
}
