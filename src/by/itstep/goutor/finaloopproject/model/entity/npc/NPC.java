package by.itstep.goutor.finaloopproject.model.entity.npc;

public class NPC {
    private String name;
    private boolean isAlive;
    private int health;
    private int BaseDamage;


    public NPC() {
        name = "no name";
        isAlive = false;
        health = 0;
        BaseDamage = 0;
    }

    public NPC(String name, boolean isAlive, int health, int BaseDamage) {
        this.name = name;
        this.isAlive = isAlive;
        this.health = health;
        this.BaseDamage = BaseDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getBaseDamage() {
        return BaseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        BaseDamage = baseDamage;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", isAlive = " + isAlive +
                ", health = " + health +
                ", BaseDamage = " + BaseDamage;
    }
}
