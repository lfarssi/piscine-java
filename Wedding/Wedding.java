import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        // your code here
         List<String> firstList = new ArrayList<>(first);
        List<String> secondList = new ArrayList<>(second);

         Collections.shuffle(firstList);
        Collections.shuffle(secondList);

         Map<String, String> couples = new HashMap<>();
        for (int i = 0; i < Math.min(firstList.size(), secondList.size()); i++) {
            couples.put(firstList.get(i), secondList.get(i));
        }
        return couples;


    }
}