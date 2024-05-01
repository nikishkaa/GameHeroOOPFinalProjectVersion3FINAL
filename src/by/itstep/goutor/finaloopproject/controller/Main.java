package by.itstep.goutor.finaloopproject.controller;

import by.itstep.goutor.finaloopproject.model.entity.container.Group;
import by.itstep.goutor.finaloopproject.model.entity.npc.*;
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
        LOGGER.setLevel(Level.DEBUG);
        Archer archer1 = new Archer("123", true, 100,
                100, 100, 10, 10, 10
                , "123", 2, 2, 2);


        Knight knight1 = new Knight("123", true, 100,
                100, 100, 10, 10, 10
                , "123", 2, 2, 3);


        Dragon dragon1 = new Dragon("123", true, 100,
                100, 100, 100, 100, 100.0);

        Hydra hydra1 = new Hydra("123", true, 100,
                100, 100, 100, 3);

        NPC[] npc = new NPC[]{archer1, knight1, dragon1, hydra1};
        Group group = new Group(npc);

        Printer.print(group.toString());
        Printer.print(UserUI.getUserUI());

        LOGGER.info(group.toString());
        LOGGER.info(UserUI.getUserUI());

    }
}
