public class Monster extends Character {
    public  Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }
    @Override
    public String toString(){
        if (this.getCurrentHealth()>0){

            return String.format("%s is a monster with %d HP", this.getName(), this.getCurrentHealth());
        } else {
            return String.format("%s is a monster and is dead", this.getName());
            
        }
    }
      @Override
    public void attack(Character character) {
        character.takeDamage(7);
    }

    @Override
    public void takeDamage(int damage) {
        int monsterDamage = (int) Math.floor(damage * 0.8);
        reduceHealth(monsterDamage);  
    } 
}
