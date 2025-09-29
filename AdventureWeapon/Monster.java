public class Monster extends Character {
    public  Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }
    @Override
    public String toString(){
        String res = (this.getCurrentHealth()>0)? String.format("%s is a monster with %d HP", this.getName(), this.getCurrentHealth()):String.format("%s is a monster and is dead", this.getName());
        return (getWeapon()!=null)?res +". He has the weapon " + getWeapon().toString(): res;
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
