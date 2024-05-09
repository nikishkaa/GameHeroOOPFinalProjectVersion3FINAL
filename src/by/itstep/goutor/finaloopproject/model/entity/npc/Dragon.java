package by.itstep.goutor.finaloopproject.model.entity.npc;

public class Dragon extends Boss {
   public int fireDamage;
    public double fireRange;

    public Dragon() {
        fireDamage = 0;
        fireRange = 0;
    }

    public Dragon(String name, boolean isAlive, int health,
                  int baseDamage, int level, int survivability,
                  int fireDamage, double fireRange) {
        super(name, isAlive, health, baseDamage, level, survivability);
        this.fireDamage = fireDamage;
        this.fireRange = fireRange;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public void setFireDamage(int fireDamage) {
        this.fireDamage = fireDamage;
    }

    public double getFireRange() {
        return fireRange;
    }

    public void setFireRange(double fireRange) {
        this.fireRange = fireRange;
    }

    @Override
    public String toString() {
        return "Dragon{" + super.toString() +
                ", fireDamage = " + fireDamage +
                ", fireRange = " + fireRange + '}';
    }
}
