package by.itstep.goutor.finaloopproject.util.creators.artifaactcreator;

import by.itstep.goutor.finaloopproject.model.entity.artifact.BigAxe;

public class BigAxeCreator extends ArtifactCreator {
    public BigAxe create() {
        return new BigAxe("Big axe", 5, 2, 10, 2);
    }
}
