package by.itstep.goutor.finaloopproject.model.entity.artifact;

public class BloodMascot extends Artifact {
    int healthUp;

    public BloodMascot() {
        healthUp = 10;
    }

    public BloodMascot(String name, int price, int slot, int upBaseDamage, int healthUp) {
        super(name, price, slot, upBaseDamage);
        this.healthUp = healthUp;
    }

    public int getHealthUp() {
        return healthUp;
    }

    public void setHealthUp(int healthUp) {
        this.healthUp = healthUp;
    }

    @Override
    public String toString() {
        return "BloodMascot{" + super.toString() +
                ", healthUp = " + healthUp + '}';
    }
}
