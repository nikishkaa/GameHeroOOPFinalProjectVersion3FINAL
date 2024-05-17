package by.itstep.goutor.finaloopproject.util.creators.artifaactcreator;

import by.itstep.goutor.finaloopproject.model.entity.artifact.BloodMascot;

public class BloodMascotCreator extends ArtifactCreator {
    public BloodMascot create() {
        return new BloodMascot("Blood mascot", 20, 1, 0, 30);
    }
}
