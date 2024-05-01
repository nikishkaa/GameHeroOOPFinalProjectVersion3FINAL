package by.itstep.goutor.finaloopproject.model.entity.npc;

public class Boss extends NPC {
    private int survivability;

    public Boss() {
        survivability = 0;
    }

    public Boss(String name, boolean isAlive, int health,
                int baseDamage, int level, int survivability) {
        super(name, isAlive, health, baseDamage, level);
        this.survivability = survivability;
    }

    public int getSurvivability() {
        return survivability;
    }

    public void setSurvivability(int survivability) {
        this.survivability = survivability;
    }


    @Override
    public String toString() {
        return super.toString() + ", survivability = " + survivability;
    }
}
