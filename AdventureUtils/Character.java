import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacter= new ArrayList<>();
    public Character(String name, int maxHealth) {
        this.maxHealth= maxHealth;
        this.currentHealth= maxHealth;
        this.name=name;
        allCharacter.add(this);
    }
    public String getName(){
        return name;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public int getCurrentHealth(){
        return currentHealth;
    }
    @Override public String toString(){
        if (this.currentHealth==0){
            return String.format("%s : KO", this.name);
        }
            return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
    }
    public  void takeDamage(int damage){
        this.currentHealth-=damage;
        if (currentHealth <0){
            this.currentHealth=0;
        }
            
    }
    public void attack(Character character){
        character.takeDamage(9);
    }
    public static String printStatus(){
        String res="";
        if (!allCharacter.isEmpty()){
            res +="------------------------------------------\n";
           res+="Characters currently fighting :\n";
            for (Character character : allCharacter){
               res+=String.format(" - %s\n", character.toString());
            }
           res+="------------------------------------------\n";

        } else {
            res+="------------------------------------------\n";
            res+="Nobody's fighting right now !\n";
            
            res+="------------------------------------------\n";
        }
        return res;
    }
    public static Character fight(Character c1, Character c2){
        while (c1.currentHealth>0 && c2.currentHealth>0){
            c1.attack(c2);
            if (c2.currentHealth==0){
                return c1;
            }
            c2.attack(c1);
            if (c1.currentHealth==0){
                return c2;
            }
        }
        return null;
    }
}
