package pl.Pr0rider.HauntedHouse.Objects;

import pl.Pr0rider.HauntedHouse.GlobalPosition;
import pl.Pr0rider.HauntedHouse.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player extends GlobalPosition {

    private String playerimage = "/images/blueghost.png";

   public int velX = 0;
   public int velY = 0;

    public Player(int x, int y){

        super(x, y);
    }

    public void uptade(){
        x += velX;
        y += velY;

        //Collision
        if (x < 1){
            x = 1;
        } else if (x > Main.WIDTH - 48){
            x = Main.WIDTH - 48;
        } else if (y < 1){
            y = 1;
        } else if (y > Main.HEIGHT - 80){
            y = Main.HEIGHT - 80;
        }
    }

    public void draw (Graphics2D g2D){
        g2D.drawImage(getPlayerImage(), x, y, null);


    }

    public Image getPlayerImage(){
        ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
        return i.getImage();
    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT){
            velX = 2;
        }else if (key == KeyEvent.VK_LEFT){
            velX = -2;
        }else if (key == KeyEvent.VK_UP){
            velY = -2;
        }else if (key == KeyEvent.VK_DOWN){
            velY = 2;
        }
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_RIGHT){
            velX = 0;
        }else if (key == KeyEvent.VK_LEFT){
            velX = 0;
        }else if (key == KeyEvent.VK_UP){
            velY = 0;
        }else if (key == KeyEvent.VK_DOWN){
            velY = 0;
        }
    }
}
