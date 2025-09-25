package Class.subclass;

public class Enemy extends Character {
    private String type;
    private int attackDmg;

    public Enemy(String name, int life, String type) {
        super();
    }

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
    public String getName() {
        return super.getName();
    }

    @Override
    public int getLife() {
        return super.getLife();
    }

    @Override
    public void receiveDmg(int dmg) {
        super.receiveDmg(dmg);
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }
}
