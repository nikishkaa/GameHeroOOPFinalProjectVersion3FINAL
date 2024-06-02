package by.itstep.goutor.finaloopproject.util.creators.artifaactcreator;

import by.itstep.goutor.finaloopproject.model.entity.artifact.GraceOfTheErdTree;

public class GraceOfTheErdTreeCreator extends ArtifactCreator {
    public GraceOfTheErdTree create() {
        return new GraceOfTheErdTree("Grace of the Erd Tree", 20, 1, 20, 1);
    }
}
