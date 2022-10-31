package cours;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> maPremiereMap = new HashMap<>();
        maPremiereMap.put("ma première clé", 3);
        System.out.println(maPremiereMap.get("ma première clé"));

        maPremiereMap.remove("ma première clé");
        System.out.println(maPremiereMap.size());

        maPremiereMap.put("deuxième clé", 2);
        maPremiereMap.keySet().forEach(s -> System.out.println("la clé vaut " + s));
        maPremiereMap.values().forEach(s -> System.out.println("la valeur vaut " + s));

        for(Entry<String, Integer> entry : maPremiereMap.entrySet()){
            System.out.println("La clé de l'entry vaut " + entry.getKey());
            System.out.println("La valeur de l'entry vaut " + entry.getValue());
        }
    }
}
