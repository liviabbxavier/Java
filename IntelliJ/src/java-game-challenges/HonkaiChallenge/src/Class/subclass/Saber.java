package Class.subclass;

public class Saber extends Character{
    //elemento: vento

    private String arm;
    private int armDmg;

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
