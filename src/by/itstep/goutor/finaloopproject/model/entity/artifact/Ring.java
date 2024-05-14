package by.itstep.goutor.finaloopproject.model.entity.artifact;

public class Ring extends Artifact {
    public double manaUp;

    public Ring() {
        manaUp = 1.5;
    }

    public Ring(String name, int price, int slot, int upBaseDamage, double manaUp) {
        super(name, price, slot, upBaseDamage);
        this.manaUp = manaUp;
    }

    public double getManaUp() {
        return manaUp;
    }

    public void setManaUp(double manaUp) {
        this.manaUp = manaUp;
    }

    @Override
    public String toString() {
        return "Ring{" + super.toString() +
                ", manaUp = " + manaUp + '}';
    }
}
