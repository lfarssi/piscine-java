import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        // your code here
        List<Integer> res=new ArrayList<>(list);
        res.sort(Comparator.naturalOrder());
         return res;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        // your code here
        List<Integer> res=new ArrayList<>(list);
        res.sort(Comparator.reverseOrder());
         return res;
    }
}