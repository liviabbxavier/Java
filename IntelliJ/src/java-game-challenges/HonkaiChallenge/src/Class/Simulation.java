package Class;

import Class.subclass.GuardianShadow;

import java.util.ArrayList;

public class Simulation {
    public static void main(String[] args) {
        ArrayList<Gamer> newGamer = new ArrayList<>();
        newGamer.add(new Gamer("Phainon", 100, "Sword"));
        //Elemento fisico
        newGamer.add(new Gamer("Blade", 100, "Sword"));
        //Elemento vento
        newGamer.add(new Gamer("Castorice", 100, "Sickle"));
        //Elemento quantico
        newGamer.add(new Gamer("Archer", 100, "Arch"));
        //Elemento quantico
        newGamer.add(new Gamer("Saber", 100, "Sword"));

        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new Enemy("Abissal Dragon", 100, "Boss"));
        enemies.add(new Enemy("Guardian Shadow", 100, "Elite"));
        enemies.add(new Enemy("Eclipse Lupine Soldier", 100, "Normal"));
    }
}
