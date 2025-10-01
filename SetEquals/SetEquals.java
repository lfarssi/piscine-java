import java.util.Set;

public class SetEquals {
    public static boolean areSetsEqual(Set<String> set1, Set<String> set2) {
        // your code here
        if (set1 == null && set2== null)return true;
        return  set1!=null && set1.equals(set2);
    }
}