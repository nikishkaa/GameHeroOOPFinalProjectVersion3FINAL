package by.itstep.goutor.finaloopproject.controller;

import by.itstep.goutor.finaloopproject.model.entity.container.Group;
import by.itstep.goutor.finaloopproject.model.entity.npc.Archer;
import by.itstep.goutor.finaloopproject.model.entity.npc.Knight;
import by.itstep.goutor.finaloopproject.model.entity.npc.NPC;
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
                , "123", 2, 2, 3);


        Knight knight1 = new Knight("123", true, 100,
                100, 100, 10, 10, 10
                , "123", 2, 2, 3);

        NPC[] npc = new NPC[]{archer1, knight1};
        Group group = new Group(npc);

        Printer.print(group.toString());
        LOGGER.info(group.toString());

    }
}
