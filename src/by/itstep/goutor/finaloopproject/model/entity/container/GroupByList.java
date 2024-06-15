package by.itstep.goutor.finaloopproject.model.entity.container;

import by.itstep.goutor.finaloopproject.model.entity.npc.Entity;

import java.util.ArrayList;
import java.util.List;

public class GroupByList {
    private List<Entity> entity;

    public GroupByList() {
        entity = new ArrayList<>();
    }

    public GroupByList(List<Entity> entity) {
        this.entity = entity;
    }

    public List<Entity> getEntity() {
        return entity;
    }

    public void setEntity(List<Entity> entity) {
        this.entity = entity;
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
