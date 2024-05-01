package by.itstep.goutor.finaloopproject.model.entity.npc;

public class Hero extends NPC {
    public static final int DEFAULT_MONEY = 100;
    public static final int DEFAULT_MANA = 100;
    public static final int DEFAULT_SPECIAL_DAMAGE = 0;
    public static final int ARTIFACT_SLOT = 2;
    public static final int DEFAULT_ARTIFACT_DAMAGE = 0;


    private int wallet;
    private int mana;
    private int specialDamage;
    private int artifactSlot;
    private int artifactDamage;
    private String artifactDescription;


    public Hero() {
        wallet = DEFAULT_MONEY;
        mana = DEFAULT_MANA;
        specialDamage = DEFAULT_SPECIAL_DAMAGE;
        artifactSlot = ARTIFACT_SLOT;
        artifactDamage = DEFAULT_ARTIFACT_DAMAGE;
        artifactDescription = "No artifact";
    }

    public Hero(String name, boolean isAlive, int health, int baseDamage, int level,
                int mana, int wallet, int specialDamage, String artifactDescription,
                int artifactSlot, int artifactDamage) {
        super(name, isAlive, health, baseDamage, level);
        this.mana = mana;
        this.wallet = wallet;
        this.specialDamage = specialDamage;
        this.artifactDescription = artifactDescription;
        this.artifactSlot = artifactSlot;
        this.artifactDamage = artifactDamage;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getSpecialDamage() {
        return specialDamage;
    }

    public void setSpecialDamage(int specialDamage) {
        this.specialDamage = specialDamage;
    }

    public int getArtifactSlot() {
        return artifactSlot;
    }

    public void setArtifactSlot(int artifactSlot) {
        this.artifactSlot = artifactSlot;
    }

    public int getArtifactDamage() {
        return artifactDamage;
    }

    public void setArtifactDamage(int artifactDamage) {
        this.artifactDamage = artifactDamage;
    }

    public String getArtifactDescription() {
        return artifactDescription;
    }

    public void setArtifactDescription(String artifactDescription) {
        this.artifactDescription = artifactDescription;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", mana = " + mana +
                ", wallet = " + wallet +
                ", specialDamage = " + specialDamage +
                ", artifactDescription = " + artifactDescription +
                ", artifactSlot = " + artifactSlot +
                ", artifactDamage = '" + artifactDamage;
    }
}
