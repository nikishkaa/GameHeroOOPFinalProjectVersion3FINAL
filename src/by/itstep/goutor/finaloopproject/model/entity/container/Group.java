package by.itstep.goutor.finaloopproject.model.entity.container;

import by.itstep.goutor.finaloopproject.model.entity.npc.NPC;

public class Group {
    public static final int DEFAULT_SIZE = 10;

    private NPC[] npc;

    public Group() {
        npc = new NPC[DEFAULT_SIZE];
    }

    public Group(NPC[] npc) {
        this.npc = npc;
    }

    public int setSize() {
        return npc.length;
    }

    public NPC[] getGroup() {
        return npc;
    }

    public void setGroup(NPC[] npc) {
        this.npc = npc;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("\nList of npc\n");

        for (NPC npcGroup : npc) {
            builder.append(npcGroup).append("\n");
        }

        return builder.toString();
    }
}
