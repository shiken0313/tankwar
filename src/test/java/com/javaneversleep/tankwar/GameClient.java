package com.javaneversleep.tankwar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameClient  extends JComponent {

    private GameClient(){
        this.setPreferredSize(new Dimension(800 ,600));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("assets/images/tankD.gif").getImage(),400,100,null);
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("史上最無聊的坦克大戰");//JFrame frame=new JFrame(String "titlename");//gui實例
        //frame.setTitle("史上最無聊的坦克大戰");
        frame.setIconImage(new ImageIcon("assets/images/icon.png").getImage());
        GameClient client = new GameClient();
        frame.add(client);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//退出程序
        frame.setLocationRelativeTo(null);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
            }
        });
        frame.pack();
        frame.setVisible(true);

    }
}
