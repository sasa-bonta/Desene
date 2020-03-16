package com.company.Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

public class Deplasare extends JPanel implements ActionListener {
    Timer timer = new Timer(50, this);
    double x = 100, y = 100, velX = 1, velY = 2;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        Color S = new Color(22, 216, 0);
        g.setColor(S);
        Rectangle2D square = new Rectangle2D.Double(x,y, 100, 100);
        g2.fill(square);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        if(x < 100 || x >= 200 ) {
            velX = -velX;
        }
        if(y < 100 || y >= 300 ) {
            velY = -velY;
        }
        x += velX;
        y += velY;
        repaint();
    }

}