package by.itstep.goutor.finaloopproject.model.entity.artifact;

public class GoldenRing extends Artifact {
    public double manaUp;

    public GoldenRing() {
        manaUp = 1.7;
    }

    public GoldenRing(String name, int price, int slot, int upBaseDamage, double manaUp) {
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
        return "GoldenRing{" + super.toString() +
                ", manaUp = " + manaUp + '}';
    }
}
