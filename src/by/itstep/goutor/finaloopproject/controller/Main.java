package by.itstep.goutor.finaloopproject.controller;

import by.itstep.goutor.finaloopproject.model.entity.container.Group;
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
        LOGGER.setLevel(Level.DEBUG);


        Group heroGroup = Creator.getHeroGroup();
        Group bossGroup = Creator.getBossGroup();


        Printer.print(heroGroup.toString() + bossGroup);
        Printer.print(UserUI.getUserUI());

        LOGGER.info(UserUI.getUserUI());
    }
}
