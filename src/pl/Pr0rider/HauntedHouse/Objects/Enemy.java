package pl.Pr0rider.HauntedHouse.Objects;

import pl.Pr0rider.HauntedHouse.GlobalPosition;
import pl.Pr0rider.HauntedHouse.Main;

import javax.swing.*;
import java.awt.*;

import static pl.Pr0rider.HauntedHouse.Objects.Enemies.*;

public class Enemy extends GlobalPosition {

    private Enemies name;
    String image = "/images/bat.png";
    int speed = 3;
    public Enemy(int x, int y, Enemies name) {
        super(x, y);
        this.name = name;
    }

    public void draw (Graphics2D g2D){
    g2D.drawImage(getEnemyImage(), x, y, null);
    }
    private String getEnemysName () {
        String enemy;
        switch ( name ) {
            case BAT:
                enemy = "/images/bat.png";
                break;
            case GHOST:
                enemy = "/images/ghost.png";
                break;
            case OWL:
                enemy = "/images/owl.png";
                break;
            case PUMPKIN:
                enemy = "/images/pumpkin.png";
                break;
            default:
                enemy = "/images/owl.png";
                break;
        }
        return enemy;
    }
    public Image getEnemyImage(){
        ImageIcon i = new ImageIcon(getClass().getResource(getEnemysName()));
        return i.getImage();
    }

    public void uptade(){
        x += speed;
        if (x > Main.WIDTH - 48){
            speed = -3;
    }
        if (x < 0){
            speed = 3;
        }
        if (y > Main.HEIGHT - 32){
            speed = -3;
        }
        if (y < 0){
            speed = 3;
        }
    }
}

