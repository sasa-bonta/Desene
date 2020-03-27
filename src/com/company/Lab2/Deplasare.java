package com.company.Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

public class Deplasare extends JPanel implements ActionListener {
    Timer timer = new Timer(20, this);
    double x = 100, y = 100, velX = 1, velY = 2;
    int red = 22, green = 216, blue = 0, r1 = 22, g1 = 216, b1 = 0, r2 = 216, g2 = 22, b2 = 0;
    int count = 0;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        Color S = new Color(red, green, blue);
        g.setColor(S);
        Rectangle2D square = new Rectangle2D.Double(x,y, 100, 100);
        g2.fill(square);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        if(x < 100 || x >= 110 ) {
            velX = -velX;
            count++;
            if (count%2 != 0) {
                red = r2;
                green = g2;
                blue = b2;
            }
            if (count%2 == 0) {
                red = r1;
                green = g1;
                blue = b1;
            }
        }

        if(y < 100 || y >= 120 ) {
            velY = -velY;
        }
        x += velX;
        y += velY;
        repaint();
    }
}