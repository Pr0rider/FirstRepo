package pl.Pr0rider.HauntedHouse;

import javax.swing.*;

public class Main {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    public static void main (String args[]){

        JFrame frame = new JFrame();
        frame.pack();
        frame.setSize(WIDTH, HEIGHT);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Game());
        frame.setVisible(true);
    }
}
