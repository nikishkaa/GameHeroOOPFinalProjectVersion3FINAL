package by.itstep.goutor.finaloopproject.model.entity.container;

import by.itstep.goutor.finaloopproject.model.entity.npc.Entity;

public class Group {
    public static final int DEFAULT_SIZE = 10;

    private  final Entity[] entity;

    public Group() {
        entity = new Entity[DEFAULT_SIZE];
    }

    public Group(Entity[] npc) {
        this.entity = npc;
    }


    public Entity[] getGroup() {
        return entity;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("\nList of npc\n");

        for (Entity npcGroup : entity) {
            builder.append(npcGroup).append("\n");
        }

        return builder.toString();
    }
}
