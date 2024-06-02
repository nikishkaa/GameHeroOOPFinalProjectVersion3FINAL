package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.entity.container.Group;
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

    @Test
    public void getVinHeroBoosWithStartStaffByGroupNullLength() {
        Group group1 = new Group();
        Group group2 = new Group();

        boolean expected = false;

        boolean actual = GameManager.getVinHeroBoosWithStartStaff(group1, group2);

        assertEquals(expected, actual);

    }


}
