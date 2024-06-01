package by.itstep.goutor.finaloopproject.model.entity.npc;

public class Knight extends Hero {
    public static final int DEFAULT_KNIGHT_DAMAGE = 10;
    public int knightDamage;

    public Knight() {
        knightDamage = DEFAULT_KNIGHT_DAMAGE;
    }

    public Knight(String name, boolean isAlive, int health, int baseDamage, int level,
                  int mana, int wallet, int specialDamage,
                  int artifactSlot,  int knightDamage) {

        super(name, isAlive, health, baseDamage, level, mana,
                wallet, specialDamage, artifactSlot);
        this.knightDamage = knightDamage;
    }

    public int getKnightDamage() {
        return knightDamage;
    }

    public void setKnightDamage(int knightDamage) {
        this.knightDamage = knightDamage;
    }

    @Override
    public String toString() {
        return "Knight{" + super.toString() +
                ", knightDamage = " + knightDamage + '}';
    }
}
