package Class;

public class Character {
    private String name;
    private int life;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void receiveDmg(int dmg) {
        life -= dmg;
        if (life <0) {
            life = 0;
        }
    }

    public boolean isAlive() {
        return life > 0;
    }

    @Override
    public String toString() {
        return "Gamer: " + getName() +
                "Life: " + getLife();
    }
}
