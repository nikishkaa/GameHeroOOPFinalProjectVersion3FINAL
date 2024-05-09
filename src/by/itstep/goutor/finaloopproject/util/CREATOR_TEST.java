package by.itstep.goutor.finaloopproject.util;

import by.itstep.goutor.finaloopproject.model.entity.container.Group;
import by.itstep.goutor.finaloopproject.model.entity.npc.Hero;
import by.itstep.goutor.finaloopproject.model.entity.npc.Knight;
import by.itstep.goutor.finaloopproject.model.entity.npc.NPC;

public class CREATOR_TEST {
    public static Knight getKnight1() {

        return new Knight("123", true, 100,
                100, 100, 100, 10, 10
                , 2, 3, 3);
    }

    public static NPC[] getNpcArray() {
        Knight knight1 = getKnight1();

        return new NPC[]{knight1};
    }

    public static Group getGroup() {
        NPC[] npcs = getNpcArray();

        return new Group(npcs);
    }
}
