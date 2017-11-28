package pl.Pr0rider.HauntedHouse;

import pl.Pr0rider.HauntedHouse.Objects.Controller;
import pl.Pr0rider.HauntedHouse.Objects.Enemies;
import pl.Pr0rider.HauntedHouse.Objects.Enemy;
import pl.Pr0rider.HauntedHouse.Objects.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;

    Timer gameLoopTimer;
    Player player;
    Controller controller;
    String background = "/images/night_background.png";

    public Game(){
        setFocusable(true);

        gameLoopTimer = new Timer(10, this);
        gameLoopTimer.start();

        player = new Player(200, 200);
        controller = new Controller();

        addKeyListener(new KeyInput(player));
    }

    public void paint (Graphics g){
    super.paint(g);

    Graphics2D g2D = (Graphics2D) g;
    g2D.drawImage(getBackgroundImage(), 0, 0, null);
    player.draw(g2D);
    controller.draw(g2D);

    }

    public Image getBackgroundImage(){
        ImageIcon i = new ImageIcon(getClass().getResource(background));
        return i.getImage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.uptade();
        controller.uptade();
        repaint();
    }
}
