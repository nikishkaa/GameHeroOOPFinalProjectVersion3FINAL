package by.itstep.goutor.finaloopproject.util.creators;

import by.itstep.goutor.finaloopproject.model.entity.ability.Ability;
import by.itstep.goutor.finaloopproject.model.entity.artifact.CreativeArtifact;
import by.itstep.goutor.finaloopproject.model.entity.container.Group;
import by.itstep.goutor.finaloopproject.model.entity.npc.*;
import by.itstep.goutor.finaloopproject.util.RndInit;
import by.itstep.goutor.finaloopproject.util.creators.artifaactcreator.CreativeArtifactCreator;

import static by.itstep.goutor.finaloopproject.controller.Main.LOGGER;

public class EntityCreator {
    public static Group getHeroGroup() {
            // Create person
        Archer archer1 = new Archer("123", true, 100,
                100, 100, 100, 10, 10
                , 2, 2);

        Knight knight1 = new Knight("123", true, 100,
                100, 100, 100, 10, 10
                , 2, 3);


            // Giv person ability
        knight1.setAbility(Ability.FLYING);

//              // Giv person creative artifact (only for test)
//        CreativeArtifactCreator artifactCreator = new CreativeArtifactCreator();
//        CreativeArtifact creativeArtifact = artifactCreator.create();
//        archer1.setArtifact(creativeArtifact);


            // Create array person
        Entity[] npcGroup = new Entity[]{archer1, knight1};

            // Create container with person
        Group heroGroup = new Group(npcGroup);
        LOGGER.info(heroGroup);

        return heroGroup;
    }

    public static Group getBossGroup() {
        Dragon dragon1 = new Dragon("123", true, 100,
                100, 100, RndInit.getBossSurvivability(), 100, 100.0);

        Hydra hydra1 = new Hydra("123", true, 100,
                100, 100, RndInit.getBossSurvivability(), 3);

        Entity[] npcGroup = new Entity[]{dragon1, hydra1};

        Group bossGroup = new Group(npcGroup);
        LOGGER.info(bossGroup);


        return bossGroup;
    }
}
