package by.itstep.goutor.finaloopproject.model.entity.npc;

import by.itstep.goutor.finaloopproject.model.entity.ability.Ability;
import by.itstep.goutor.finaloopproject.model.entity.artifact.Artifact;

public class Hero extends Entity {
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

    private Artifact artifact;
    private Ability ability;

    public Hero() {
        wallet = DEFAULT_MONEY;
        mana = DEFAULT_MANA;
        specialDamage = DEFAULT_SPECIAL_DAMAGE;
        artifactSlot = ARTIFACT_SLOT;
        artifactDamage = DEFAULT_ARTIFACT_DAMAGE;
    }

    public Hero(String name, boolean isAlive, int health, int baseDamage, int level,
                int mana, int wallet, int specialDamage,
                int artifactSlot, int artifactDamage) {
        super(name, isAlive, health, baseDamage, level);
        this.mana = mana;
        this.wallet = wallet;
        this.specialDamage = specialDamage;
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


    public Artifact getArtifact() {
        return artifact;
    }

    public void setArtifact(Artifact artifact) {
        if (artifact.getPrice() <= wallet && artifact.getSlot() <= artifactSlot) {
            this.artifact = artifact;
            wallet -= artifact.getPrice();
            artifactSlot -= artifact.getSlot();
            setArtifactDamage(artifact.getArtifactDamage());
        } else {
            this.artifact = null;
        }
    }

    public void setAbility(Ability ability) {
        if (ability.getManaCost() <= mana) {
            this.ability = ability;
            mana -= ability.getManaCost();
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                ", mana = " + mana +
                ", wallet = " + wallet +
                ", specialDamage = " + specialDamage +
                ", artifactSlot = " + artifactSlot +
                ", artifactDamage = " + artifactDamage +
                ", Artifact = " + artifact +
                ", ability description = " + ability;
    }
}
