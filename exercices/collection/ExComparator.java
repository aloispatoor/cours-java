package exercices.collection;

import java.util.Comparator;

public class ExComparator implements Comparator <Integer> {
    
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 < o2 ? -1 : o1 == o2 ? 0 : -1;
        // return o2.compareTo(o1)
    }
}
