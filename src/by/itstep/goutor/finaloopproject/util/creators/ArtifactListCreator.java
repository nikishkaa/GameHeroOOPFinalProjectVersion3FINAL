package by.itstep.goutor.finaloopproject.util.creators;

import by.itstep.goutor.finaloopproject.model.entity.artifact.*;
import by.itstep.goutor.finaloopproject.util.creators.artifaactcreator.*;

import java.util.List;

public class ArtifactListCreator {
    // Create artifact(with factory method)
    BigAxeCreator bigAxeCreator = new BigAxeCreator();
    BigAxe bigAxe = bigAxeCreator.create();

    BloodMascotCreator bloodMascotCreator = new BloodMascotCreator();
    BloodMascot bloodMascot = bloodMascotCreator.create();

    GoldenRingCreator goldenRingCreator = new GoldenRingCreator();
    GoldenRing goldenRing = goldenRingCreator.create();

    RingCreator ringCreator = new RingCreator();
    Ring ring = ringCreator.create();

    GraceOfTheErdTreeCreator graceOfTheErdTreeCreator = new GraceOfTheErdTreeCreator();
    GraceOfTheErdTree graceOfTheErdTree = graceOfTheErdTreeCreator.create();

    CreativeArtifactCreator creativeArtifactCreator = new CreativeArtifactCreator();
    CreativeArtifact creativeArtifact = creativeArtifactCreator.create();

    // List.of - Создание неизменяемого списка.
    private final List<Artifact> artifacts = List.of(bigAxe, bloodMascot, goldenRing, ring, graceOfTheErdTree, creativeArtifact);

    public List<Artifact> getArtifacts() {
        return artifacts;
    }

}
