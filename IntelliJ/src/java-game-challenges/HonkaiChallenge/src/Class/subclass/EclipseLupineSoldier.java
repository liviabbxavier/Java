package Class.subclass;

public class EclipseLupineSoldier extends Character {
    //Fraqueza: físico e vento

    private String type;
    private int attackDmg;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttackDmg() {
        return attackDmg;
    }

    public void setAttackDmg(int attackDmg) {
        this.attackDmg = attackDmg;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    public void receiveDmg(int dmg) {
        super.receiveDmg(dmg);
    }

    @Override
    public void setLife(int life) {
        super.setLife(life);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
