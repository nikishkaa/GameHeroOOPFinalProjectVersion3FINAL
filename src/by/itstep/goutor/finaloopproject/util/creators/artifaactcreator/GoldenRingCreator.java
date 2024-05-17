package by.itstep.goutor.finaloopproject.util.creators.artifaactcreator;

import by.itstep.goutor.finaloopproject.model.entity.artifact.GoldenRing;

public class GoldenRingCreator extends ArtifactCreator {
    public GoldenRing create() {
        return new GoldenRing("Golden Ring", 15, 1, 10, 1.7);
    }

}
