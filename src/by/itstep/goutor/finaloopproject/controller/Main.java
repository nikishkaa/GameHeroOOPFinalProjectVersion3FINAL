package by.itstep.goutor.finaloopproject.controller;

import by.itstep.goutor.finaloopproject.model.entity.artifact.Artifact;
import by.itstep.goutor.finaloopproject.model.entity.container.Group;
import by.itstep.goutor.finaloopproject.model.logic.GameManager;
import by.itstep.goutor.finaloopproject.util.EntityBinaryWorker;
import by.itstep.goutor.finaloopproject.util.creators.ArtifactListCreator;
import by.itstep.goutor.finaloopproject.util.creators.EntityCreator;
import by.itstep.goutor.finaloopproject.util.UserUI;
import by.itstep.goutor.finaloopproject.view.Printer;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.List;

public class Main {
    public static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }


    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOGGER.setLevel(Level.OFF);


        Group heroGroup = EntityCreator.getHeroGroup();
        Group bossGroup = EntityCreator.getBossGroup();

        ArtifactListCreator artifactListCreator = new ArtifactListCreator();
        List<Artifact> artifacts = artifactListCreator.getArtifacts();


        boolean vinWithStartStaff = GameManager.calculateVinHeroBoosWithStartStaff(heroGroup, bossGroup);
        Artifact minStatArtifactUp = GameManager.getMinStatArtifact(artifacts, heroGroup, bossGroup);


        Printer.print(heroGroup.toString() + bossGroup);
        Printer.print(UserUI.getUserUI(vinWithStartStaff, minStatArtifactUp));

        LOGGER.info(UserUI.getUserUI(vinWithStartStaff, minStatArtifactUp));


        //Serialization
        String entityFilaName = "D:/прога/entityHero.dat";
        String bossFilaName = "D:/прога/entityBoss.dat";

        EntityBinaryWorker.entitySerialize(entityFilaName, heroGroup);
        EntityBinaryWorker.entitySerialize(bossFilaName, bossGroup);


        String amuletFilaName = "D:/прога/amulet.dat";
        EntityBinaryWorker.amuletSerialize(amuletFilaName, artifacts);

    }
}
