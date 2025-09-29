public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character character) {
        character.receiveHealing(healCapacity);
    }

    @Override
    public void attack(Character target) {
        heal(this);
        int damage = getWeapon() != null ? getWeapon().getDamage() : 10;
        target.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        reduceHealth(damage);
    }

    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", getName(), getHealCapacity());

        } else {

            return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", getName(), getCurrentHealth(),
                    getHealCapacity());
        }
    }

}
