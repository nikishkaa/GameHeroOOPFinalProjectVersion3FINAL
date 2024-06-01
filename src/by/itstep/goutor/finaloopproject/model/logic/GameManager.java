package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.entity.container.Group;
import by.itstep.goutor.finaloopproject.model.entity.npc.*;

import static by.itstep.goutor.finaloopproject.controller.Main.LOGGER;

public class GameManager {
    public static boolean getVinHeroBoosWithStartStaff(Group hero, Group boss) {
        if (hero == null || boss == null || Group.DEFAULT_SIZE == 0) {
            LOGGER.warn("hero == null || boss == null || Group.DEFAULT_SIZE == 0");
            return false;
        }

        return getVinStat(hero) > getVinStat(boss);
    }


    // FOR TEST DELETE THIS METHOD!!!

//    public static int getVinStats(Group hero) {
//        return getVinStat(hero);
//    }


    private static int getVinStat(Group group) {
        int stat = 0;
        for (Entity t : group.getGroup()) {
            if (t.isAlive()) {
                stat += t.getBaseDamage();

                if (t instanceof Hero) {
                    stat += ((Hero) t).getSpecialDamage();
                    stat += ((Hero) t).getArtifactDamage();

                    if (t instanceof Knight) {
                        stat += ((Knight) t).getKnightDamage();
                    }

                    if (t instanceof Archer) {
                        stat += ((Archer) t).getArcherDamage();
                    }

                }


                if (t instanceof Boss) {
                    stat += ((Boss) t).getSurvivability();

                    if (t instanceof Dragon) {
                        stat += ((Dragon) t).getFireDamage();
                    }

                    if (t instanceof Hydra) {
                        stat += (t.getBaseDamage() / 10) * ((Hydra) t).headCount;
                    }
                }


            } else {
                stat = 0;

            }
        }


        return stat;
    }


}
