public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    public Character(String name, int maxHealth) {
        this.maxHealth= maxHealth;
        this.currentHealth= maxHealth;
        this.name=name;
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
            return "KO";
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
}
