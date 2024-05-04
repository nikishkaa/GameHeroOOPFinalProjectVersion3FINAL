package by.itstep.goutor.finaloopproject.model.ability;

public enum Ability {
    FLYING("Flying ability", 50),
    FIRE("Fire ability", 30),
    TELEPORTATION("Teleportation ability", 70);

    private final String description;
    private final int manaCost;

    Ability(String description, int manaCost) {
        this.description = description;
        this.manaCost = manaCost;
    }

    public String getDescription() {
        return description;
    }

    public int getManaCost() {
        return manaCost;
    }

}
