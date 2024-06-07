package by.itstep.goutor.finaloopproject.util;

import java.util.Random;

public class RndInit {
    public static final Random RANDOM;

    static {
        RANDOM = new Random();
    }

    public static int getBossSurvivability() {
// Generate survivability for boss. Range 100 - 150/

        return RANDOM.nextInt(50 + 1) + 100;
    }


    public static int getHeroMoney() {
//        Rnd number 20 - 30
        return RANDOM.nextInt(10 + 1) + 20;
    }
}
