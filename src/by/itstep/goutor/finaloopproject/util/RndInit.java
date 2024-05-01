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
}
