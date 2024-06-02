package by.itstep.goutor.finaloopproject.util.creators.artifaactcreator;

import by.itstep.goutor.finaloopproject.model.entity.artifact.CreativeArtifact;

public class CreativeArtifactCreator extends ArtifactCreator {
    public CreativeArtifact create() {
        return new CreativeArtifact("CREATIVE ARTIFACT", 0, 0, 1000
                , "Creative artifact for balance test");
    }
}
