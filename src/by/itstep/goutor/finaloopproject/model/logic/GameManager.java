package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.entity.container.Group;
import by.itstep.goutor.finaloopproject.model.entity.npc.NPC;

import static by.itstep.goutor.finaloopproject.controller.Main.LOGGER;

public class GameManager {
    public static boolean getVinHeroBoos(Group hero, Group boss) {
        if (hero == null || boss == null || Group.DEFAULT_SIZE == 0) {
            LOGGER.warn("hero == null || boss == null || Group.DEFAULT_SIZE == 0");
            return false;
        }
        boolean vin = false;

//        int heroStat = ;
//        int bossStat = ;

        return vin;
    }

    public static int getVinStat(Group group) {
        int stat = 0;
        for (NPC t : group.getGroup()) {
            stat += t.getBaseDamage();
            stat += t.getSpecialDamage();
        }

        return stat;
    }


}
