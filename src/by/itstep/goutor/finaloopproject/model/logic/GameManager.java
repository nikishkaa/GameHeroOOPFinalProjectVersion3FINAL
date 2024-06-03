package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.entity.artifact.Artifact;
import by.itstep.goutor.finaloopproject.model.entity.container.Group;
import by.itstep.goutor.finaloopproject.model.entity.npc.*;

import java.util.List;


import static by.itstep.goutor.finaloopproject.controller.Main.LOGGER;

public class GameManager {
    // Calculate win or no hero with a start staff
    public static boolean calculateVinHeroBoosWithStartStaff(Group hero, Group boss) {
        if (hero == null || boss == null || Group.DEFAULT_SIZE == 0
                || hero.getEntity().length == 0 || boss.getEntity().length == 0) {
            LOGGER.warn("hero == null || boss == null || Group.DEFAULT_SIZE == 0");
            return false;
        }

        return calculateVinStat(hero) > calculateVinStat(boss);
    }


    // Search a min stats artifact to equip in a hero
    private static Artifact findMinStatArtifact(List<Artifact> artifacts, Group hero, Group boss) {
        Artifact minStatArtifactUp = null;

        int heroVinStat = calculateVinStat(hero);
        int bossVinStat = calculateVinStat(boss);

        for (Artifact artifact : artifacts) {
            if (heroVinStat + artifact.getArtifactDamage() > bossVinStat) {
                if (minStatArtifactUp == null || artifact.getArtifactDamage() < minStatArtifactUp.getArtifactDamage()) {
                    minStatArtifactUp = artifact;
                }
            }
        }

        return minStatArtifactUp;
    }


    // Getter for min artifact to win |
    public static Artifact getMinStatArtifact(List<Artifact> artifacts, Group hero, Group boss) {
        if (hero == null || boss == null || Group.DEFAULT_SIZE == 0
                || hero.getEntity().length == 0 || boss.getEntity().length == 0) {
            LOGGER.warn("hero == null || boss == null || Group.DEFAULT_SIZE == 0");
        }

        return findMinStatArtifact(artifacts, hero, boss);
    }


    // Calculate entity total stats
    private static int calculateVinStat(Group group) {
        int stat = 0;
        for (Entity t : group.getEntity()) {
            if (t.isAlive()) {
                stat += t.getBaseDamage();
                stat += calcHeroStat(t);
                stat += calcBossStat(t);
            } else {
                stat = 0;
            }
        }
        return stat;
    }

    // Calculate hero stat
    private static int calcHeroStat(Entity t) {
        int stat = 0;
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
        return stat;
    }

    // Calculate boss stat
    private static int calcBossStat(Entity t) {
        int stat = 0;
        if (t instanceof Boss) {
            stat += ((Boss) t).getSurvivability();

            if (t instanceof Dragon) {
                stat += ((Dragon) t).getFireDamage();
            }

            if (t instanceof Hydra) {
                stat += (t.getBaseDamage() / 10) * ((Hydra) t).headCount;
            }
        }
        return stat;
    }

}
