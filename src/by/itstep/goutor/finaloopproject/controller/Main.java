package by.itstep.goutor.finaloopproject.controller;

import by.itstep.goutor.finaloopproject.model.ability.Ability;
import by.itstep.goutor.finaloopproject.model.entity.artifact.BigAxe;
import by.itstep.goutor.finaloopproject.model.entity.container.Group;
import by.itstep.goutor.finaloopproject.model.entity.npc.Archer;
import by.itstep.goutor.finaloopproject.model.entity.npc.NPC;
import by.itstep.goutor.finaloopproject.util.Creator;
import by.itstep.goutor.finaloopproject.util.UserUI;
import by.itstep.goutor.finaloopproject.view.Printer;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Main {
    public static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOGGER.setLevel(Level.OFF);

        Group heroGroup = Creator.getHeroGroup();
        Group bossGroup = Creator.getBossGroup();


        Printer.print(heroGroup.toString() + bossGroup);
        Printer.print(UserUI.getUserUI());

        LOGGER.info(UserUI.getUserUI());


        Archer archer1 = new Archer("123", true, 100,
                100, 100, 100, 10, 0
                , 2, 0, 2);


        BigAxe bigAxe = new BigAxe("123", 10, 2, 10, 10);
        Ability ability = Ability.FLYING;


        archer1.setArtifact(bigAxe);
        archer1.setAbility(ability);

        NPC[] npcs = new NPC[]{archer1};
        Group group = new Group(npcs);

        System.out.println(group);
    }
}
