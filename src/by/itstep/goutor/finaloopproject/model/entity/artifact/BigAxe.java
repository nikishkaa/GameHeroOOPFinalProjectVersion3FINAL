package by.itstep.goutor.finaloopproject.model.entity.artifact;

public class BigAxe extends Artifact {
    private int attackSpeed;

    public BigAxe() {
        attackSpeed = 2;
    }

    public BigAxe(String name, int price, int slot, int upBaseDamage, int attackSpeed) {
        super(name, price, slot, upBaseDamage);
        this.attackSpeed = attackSpeed;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    @Override
    public String toString() {
        return "BigAxe{" + super.toString() +
                ", attackSpeed = " + attackSpeed + '}';
    }
}
