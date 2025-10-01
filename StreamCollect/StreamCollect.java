import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        // your code here
        return s.filter(str->!str.isEmpty()).collect(Collectors.groupingBy(str->str.charAt(0)));
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        // your code here
        return s.collect(Collectors.groupingBy(
                num -> num % 4, 
                Collectors.maxBy(Integer::compareTo)
        ));
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        // your code here
         return s.sorted() // Sort the strings alphabetically
                .collect(Collectors.joining(" # ", "{", "}"));
    }
}