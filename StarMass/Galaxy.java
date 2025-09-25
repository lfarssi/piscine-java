import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galaxy extends CelestialObject {
    private List<CelestialObject> celestialObjects;
    public Galaxy(){
        super();
        this.celestialObjects = new ArrayList<>() ;
    }
    public List<CelestialObject> getCelestialObjects(){
        return this.celestialObjects;
    }
    public void addCelestialObject(CelestialObject cele){
        celestialObjects.add(cele);
    }
    public Map<String, Integer> computeMassRepartition(){
        Map<String, Integer> massMap = new HashMap<>();
        massMap.put("Star", 0);
        massMap.put("Planet", 0);
        massMap.put("Other", 0);

        for (CelestialObject obj : celestialObjects) {
            if (obj instanceof Star) {
                massMap.put("Star", massMap.get("Star") + obj.getMass());
            } else if (obj instanceof Planet) {
                massMap.put("Planet", massMap.get("Planet") + obj.getMass());
            } else {
                massMap.put("Other", massMap.get("Other") + obj.getMass());
            }
        }
       
        return massMap;
    }
}