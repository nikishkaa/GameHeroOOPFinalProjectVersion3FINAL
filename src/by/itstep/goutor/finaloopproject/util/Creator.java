package by.itstep.goutor.finaloopproject.util;

import by.itstep.goutor.finaloopproject.model.entity.container.Group;
import by.itstep.goutor.finaloopproject.model.entity.npc.*;

import static by.itstep.goutor.finaloopproject.controller.Main.LOGGER;

public class Creator {
    public static Group getHeroGroup() {
        Archer archer1 = new Archer("123", true, 100,
                100, 100, 100, 10, 10
                , 2, 0, 2);


        Knight knight1 = new Knight("123", true, 100,
                100, 100, 100, 10, 10
                , 2, 3, 3);

        NPC[] npcGroup = new NPC[]{archer1, knight1};

        Group heroGroup = new Group(npcGroup);
        LOGGER.info(heroGroup);

        return heroGroup;
    }

    public static Group getBossGroup() {
        Dragon dragon1 = new Dragon("123", true, 100,
                100, 100, RndInit.getBossSurvivability(), 100, 100.0);

        Hydra hydra1 = new Hydra("123", true, 100,
                100, 100, RndInit.getBossSurvivability(), 3);

        NPC[] npcGroup = new NPC[]{dragon1, hydra1};

        Group bossGroup = new Group(npcGroup);
        LOGGER.info(bossGroup);


        return bossGroup;
    }
}
