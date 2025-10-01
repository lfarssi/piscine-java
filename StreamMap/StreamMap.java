import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        // your code here
        return s.mapToInt(String::length)
                .sum();
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        // your code here
        return s.map(String::toUpperCase) 
                .collect(Collectors.toList());
    }

    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        // your code here
        return s.filter(d -> d > 42) 
                .map(d -> (int) Math.floor(d)) 
                .collect(Collectors.toSet());
    }
}
