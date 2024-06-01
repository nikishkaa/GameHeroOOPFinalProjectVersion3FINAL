package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.entity.container.Group;
import by.itstep.goutor.finaloopproject.model.entity.npc.Boss;
import by.itstep.goutor.finaloopproject.model.entity.npc.Hero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameManagerTest {


    @Test
    public void getVinHeroBoosWithStartStaffByNull() {
        Group hero = null;
        Group boss = null;
        boolean expected = false;

        boolean actual = GameManager.getVinHeroBoosWithStartStaff(hero, boss);

        assertEquals(expected, actual);
    }


}
