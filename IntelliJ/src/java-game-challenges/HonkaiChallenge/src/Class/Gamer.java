package Class;

public class Gamer extends Character{
    private String arm;
    private int armDmg;

    public Gamer(String name, int life, String arm) {
        super();
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

    public void attackEnemy(Enemy enemy) {
        enemy.receiveDmg(armDmg);
        System.out.println("DMG received: " + armDmg);
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
    public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    public void receiveDmg(int dmg) {
        super.receiveDmg(dmg);
    }

    @Override
    public String toString() {
        return "Gamer: " + getName() +
                "Life: " + getLife() +
                "Arm: " + getArm();
    }

}
