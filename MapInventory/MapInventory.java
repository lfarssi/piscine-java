import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        // your code here
        return inventory.getOrDefault(productId,-1);
        
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        // your code here
        List<String> list= new ArrayList<>();
        for (Map.Entry<String,Integer> entry : inventory.entrySet() ){
            if (entry.getValue()==price){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}