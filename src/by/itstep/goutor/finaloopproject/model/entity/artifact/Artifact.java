package by.itstep.goutor.finaloopproject.model.entity.artifact;

public class Artifact {
    private String name;
    private int price;
    private int slot;
    private int artifactDamage;

    public Artifact() {
        name = "No name";
        price = 0;
        slot = 0;
        artifactDamage = 0;
    }

    public Artifact(String name, int price, int slot, int artifactDamage) {
        this.name = name;
        this.price = price;
        this.slot = slot;
        this.artifactDamage = artifactDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getArtifactDamage() {
        return artifactDamage;
    }

    public void setArtifactDamage(int artifactDamage) {
        this.artifactDamage = artifactDamage;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", price = " + price +
                ", slot = " + slot +
                ", artifactDamage = " + artifactDamage;
    }
}
