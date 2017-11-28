package pl.Pr0rider.HauntedHouse.Objects;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Controller {

    List<Enemy> enemyList = new LinkedList<Enemy>();
    Enemy tempEnemy;

    public Controller() {
        addEnemy(new Enemy(48, 32, Enemies.BAT));
        addEnemy(new Enemy(48, 100, Enemies.GHOST));
        addEnemy(new Enemy(48, 200, Enemies.OWL));
        addEnemy(new Enemy(48, 300, Enemies.PUMPKIN));
        addEnemy(new Enemy(48, 400, Enemies.BAT));
    }

    public void draw(Graphics2D g2D) {
        for (int i = 0; i < enemyList.size(); i++) {
            tempEnemy = enemyList.get(i);
            tempEnemy.draw(g2D);
        }
    }

    public void uptade() {
        for (int i = 0; i < enemyList.size(); i++) {
            tempEnemy = enemyList.get(i);
            tempEnemy.uptade();
        }
    }

    public void addEnemy(Enemy enemy) {
        enemyList.add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        enemyList.remove(enemy);
    }
}

