// import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        // your code here
        set1.addAll(set2);
        return set1;
    }
    
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        // your code here
        set1.retainAll(set2);
        return set1;
    }
}