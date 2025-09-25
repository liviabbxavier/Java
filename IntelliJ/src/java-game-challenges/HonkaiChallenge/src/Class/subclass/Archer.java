package Class.subclass;

public class Archer extends Character{
    //Elemento: quantico

    private String arm;
    private int armDmg;

    public Archer(String name, String arm, int life, int armDmg) {
        super(name, life);
        this.arm = arm;
        this.armDmg = armDmg;
    }

    public String getArm() {
        return arm;
    }

    public void setArm(String arm) {
        this.arm = arm;
    }

    public int getArmDmg() {
        return armDmg;
    }

    public void setArmDmg(int armDmg) {
        this.armDmg = armDmg;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setLife(int life) {
        super.setLife(life);
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

    @Override
    public String toString() {
        return super.toString();
    }
}
