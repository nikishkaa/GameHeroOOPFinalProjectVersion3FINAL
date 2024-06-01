package by.itstep.goutor.finaloopproject.util.creators;

import by.itstep.goutor.finaloopproject.model.entity.artifact.*;
import by.itstep.goutor.finaloopproject.util.creators.artifaactcreator.BigAxeCreator;
import by.itstep.goutor.finaloopproject.util.creators.artifaactcreator.BloodMascotCreator;
import by.itstep.goutor.finaloopproject.util.creators.artifaactcreator.GoldenRingCreator;
import by.itstep.goutor.finaloopproject.util.creators.artifaactcreator.RingCreator;

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

    // List.of - Создание неизменяемого списка.
    private final List<Artifact> artifacts = List.of(bigAxe, bloodMascot, goldenRing, ring);

    public List<Artifact> getArtifacts() {
        return artifacts;
    }

}
