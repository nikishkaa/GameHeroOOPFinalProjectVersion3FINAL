package by.itstep.goutor.finaloopproject.model.entity.artifact;

public class GraceOfTheErdTree extends Artifact {
    int usabilityLevel;

    public GraceOfTheErdTree(String name, int price, int slot, int artifactDamage, int usabilityLevel) {
        super(name, price, slot, artifactDamage);
        this.usabilityLevel = usabilityLevel;
    }

    public int getUsabilityLevel() {
        return usabilityLevel;
    }

    public void setUsabilityLevel(int usabilityLevel) {
        this.usabilityLevel = usabilityLevel;
    }

    @Override
    public String toString() {
        return "usabilityLevel{" + super.toString() +
                ", usabilityLevel = " + usabilityLevel + '}';
    }
}
