package pl.Pr0rider.HauntedHouse;

import pl.Pr0rider.HauntedHouse.Objects.Player;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{

    Player player;

    public KeyInput(Player player){
        this.player = player;
    }

    public void keyPressed (KeyEvent e){
        player.keyPressed(e);
    }
    public void keyReleased (KeyEvent e){
        player.keyReleased(e);
    }
}
