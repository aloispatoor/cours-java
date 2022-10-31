package cours;
import TP.Dirigeable;

import java.util.Comparator;

public class DirigeableComparator implements Comparator <Dirigeable> {
    public int compare(Dirigeable o1, Dirigeable o2){
        o1.getIdentifiant().compareTo(o2.getIdentifiant());
    }
}
