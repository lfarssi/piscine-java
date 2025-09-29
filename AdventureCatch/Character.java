import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private final Weapon weapon; 

    private static List<Character> allCharacters= new ArrayList<>();
    public Character(String name, int maxHealth, Weapon weapon) {
        this.maxHealth= maxHealth;
        this.currentHealth= maxHealth;
        this.name=name;
        this.weapon= weapon;
        allCharacters.add(this);
    }
     public Weapon getWeapon() {
        return weapon;
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

    protected void setCurrentHealth(int currentHealth) throws DeadCharacterException {
        if (currentHealth < 0) {
            this.currentHealth = 0;
        } else if (currentHealth > maxHealth) {
            this.currentHealth = maxHealth;
        } else {
            this.currentHealth = currentHealth;
        }
    }


    public abstract void takeDamage(int damage) throws DeadCharacterException;
    public abstract void attack(Character character) throws DeadCharacterException;


    public static String printStatus(){
        String res="";
        if (!allCharacters.isEmpty()){
            res +="------------------------------------------\n";
           res+="Characters currently fighting :\n";
            for (Character character : allCharacters){
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
            try {
            c1.attack(c2);
        } catch (DeadCharacterException ignored) {}
        if (c2.getCurrentHealth() == 0) return c1;

        try {
            c2.attack(c1);
        } catch (DeadCharacterException ignored) {}
        if (c1.getCurrentHealth() == 0) return c2;
        }
        return null;
    }
    public void receiveHealing(int ta9a)throws DeadCharacterException{
        if (currentHealth == 0)
            throw new DeadCharacterException(this);
        if (currentHealth==0)return;
        currentHealth+=ta9a;
        if (currentHealth>maxHealth){
            currentHealth=maxHealth;    
        }
    }
    public void reduceHealth(int damage) throws DeadCharacterException {
          if (currentHealth == 0)
            throw new DeadCharacterException(this);
        currentHealth -= damage;
        if (currentHealth < 0)
            currentHealth = 0;
    }
}
