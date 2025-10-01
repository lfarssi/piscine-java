import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        // your code here
        List<Integer> result = new ArrayList<>();
        List<Integer> sortedCoins = new ArrayList<>(coins);
        Collections.sort(sortedCoins, Collections.reverseOrder());
        for (int coin : sortedCoins) {
            while (amount >= coin) {
                result.add(coin);
                amount -= coin;
            }
        }
        return result;

    }
}