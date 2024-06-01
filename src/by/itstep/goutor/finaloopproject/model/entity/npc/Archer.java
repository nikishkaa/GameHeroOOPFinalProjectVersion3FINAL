package by.itstep.goutor.finaloopproject.model.entity.npc;

public class Archer extends Hero {
    public static final int DEFAULT_ARCHER_DAMAGE = 15;
    public int archerDamage;

    public Archer() {
        archerDamage = DEFAULT_ARCHER_DAMAGE;
    }

    public Archer(String name, boolean isAlive, int health, int baseDamage, int level,
                  int mana, int wallet, int specialDamage,
                  int artifactSlot, int archerDamage) {

        super(name, isAlive, health, baseDamage, level, mana,
                wallet, specialDamage, artifactSlot);
        this.archerDamage = archerDamage;
    }

    public int getArcherDamage() {
        return archerDamage;
    }

    public void setArcherDamage(int archerDamage) {
        this.archerDamage = archerDamage;
    }

    @Override
    public String toString() {
        return "Archer{" + super.toString() +
                ", archerDamage = " + archerDamage + '}';
    }
}
