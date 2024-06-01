package by.itstep.goutor.finaloopproject.model.entity.npc;

public class Entity {
    public static final int DEFAULT_LEVEL = 10;

    private String name;
    private boolean isAlive;
    private int health;
    private int baseDamage;
    private int level;

    public Entity() {
        name = "no name";
        isAlive = false;
        health = 0;
        baseDamage = 0;
        level = DEFAULT_LEVEL;
    }

    public Entity(String name, boolean isAlive, int health, int baseDamage, int level) {
        this.name = name;
        this.isAlive = isAlive;
        this.health = health;
        this.baseDamage = baseDamage;
        this.level = level;
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
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    @Override
    public String toString() {
        return "name = " + name +
                ", isAlive = " + isAlive +
                ", health = " + health +
                ", BaseDamage = " + baseDamage
                + ", level = " + level;
    }
}
