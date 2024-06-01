package by.itstep.goutor.finaloopproject.model.entity.container;

import by.itstep.goutor.finaloopproject.model.entity.npc.Entity;

public class Group {
    public static final int DEFAULT_SIZE = 10;

    private Entity[] npc;

    public Group() {
        npc = new Entity[DEFAULT_SIZE];
    }

    public Group(Entity[] npc) {
        this.npc = npc;
    }

    public int setSize() {
        return npc.length;
    }

    public Entity[] getGroup() {
        return npc;
    }

    public void setGroup(Entity[] npc) {
        this.npc = npc;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("\nList of npc\n");

        for (Entity npcGroup : npc) {
            builder.append(npcGroup).append("\n");
        }

        return builder.toString();
    }
}
