package by.itstep.goutor.finaloopproject.model.entity.artifact;

public class CreativeArtifact extends Artifact {
    private static String Description;

    public CreativeArtifact(String name, int price, int slot, int artifactDamage, String description) {
        super(name, price, slot, artifactDamage);
        Description = description;
    }

    public static String getDescription() {
        return Description;
    }

    @Override
    public String toString() {
        return "CreativeArtifact " + "Description = " + Description;
    }
}
