package by.itstep.goutor.finaloopproject.util.creators.artifaactcreator;

import by.itstep.goutor.finaloopproject.model.entity.artifact.Ring;

public class RingCreator extends ArtifactCreator {
    public Ring create() {
        return new Ring("Ring", 10, 1, 5, 1.5);
    }
}
