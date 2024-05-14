package by.itstep.goutor.finaloopproject.util.creators;

import by.itstep.goutor.finaloopproject.model.entity.artifact.BigAxe;
import by.itstep.goutor.finaloopproject.model.entity.artifact.BloodMascot;
import by.itstep.goutor.finaloopproject.model.entity.artifact.GoldenRing;
import by.itstep.goutor.finaloopproject.model.entity.artifact.Ring;

public class ArtifactCreator {
    public static BigAxe initBigAxe() {

        return new BigAxe("Big axe", 5, 2, 10, 2);
    }

    public static Ring initRing() {

        return new Ring("Ring", 10, 1, 5, 1.5);
    }

    public static GoldenRing initGoldenRing() {

        return new GoldenRing("Golden Ring", 15, 1, 10, 1.7);
    }

    public static BloodMascot initBloodMascot() {

        return new BloodMascot("Blood mascot", 20, 1, 0, 30);
    }

}
