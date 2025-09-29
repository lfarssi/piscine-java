import java.rmi.server.ExportException;

public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character character) throws DeadCharacterException {
        character.receiveHealing(healCapacity);
    }

    @Override
    public int getShield() {
        return shield;
    }

    @Override
    public void attack(Character character) throws DeadCharacterException {
         heal(this);
        int damage = getWeapon() != null ? getWeapon().getDamage() : 6;
        character.takeDamage(damage);
    }   

    @Override
    public void takeDamage(int damage) throws DeadCharacterException {
        int templarDamage = damage - shield;
        if (templarDamage < 0)
            templarDamage = 0;
        reduceHealth(templarDamage);
    }

    @Override
    public String toString() {
        String  res = (getCurrentHealth() != 0)  ?String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",
                    getName(), getCurrentHealth(), getHealCapacity(), getShield()):
                     String.format("%s has been beaten, even with its %d shield. So bad, it could heal %s HP.", getName(),
                    getShield(), getHealCapacity());
        
        return (getWeapon()==null)? res: res +" He has the weapon " + getWeapon().toString();
    }
}
