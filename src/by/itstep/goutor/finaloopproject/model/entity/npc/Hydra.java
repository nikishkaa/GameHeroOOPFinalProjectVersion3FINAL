package by.itstep.goutor.finaloopproject.model.entity.npc;

public class Hydra extends Boss {
    public static final int DEFAULT_HEAD_COUNT = 1;
    public int headCount;

    public Hydra() {
        headCount = DEFAULT_HEAD_COUNT;
    }

    public Hydra(String name, boolean isAlive, int health,
                 int baseDamage, int level, int survivability, int headCount) {
        super(name, isAlive, health, baseDamage, level, survivability);
        this.headCount = headCount;
    }

    public int getHeadCount() {
        return headCount;
    }

    public void setHeadCount(int headCount) {
        this.headCount = headCount;
    }

    @Override
    public String toString() {
        return "Hydra{" + super.toString() +
                ", headCount = " + headCount + '}';
    }
}
