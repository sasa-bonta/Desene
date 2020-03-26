package com.company.Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

public class Rotire extends JPanel implements ActionListener {
    Timer timer = new Timer(50, this);
    double rotation = 0, grades = 1;
    int red = 22, green = 216, blue = 0, r1 = 22, g1 = 216, b1 = 0, r2 = 216, g2 = 22, b2 = 0;
    int count = 0;

    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Color S = new Color(red, green, blue);
        g.setColor(S);
        Rectangle square = new Rectangle(100, 100, 100, 100);
        g2.rotate(rotation/180, square.x + square.width/2, square.y + square.height/2);
        g2.fill(square);
        timer.start();
    }
    public void actionPerformed(ActionEvent ae) {
        if(rotation < 0 || rotation >= 25 ) {
            grades = -grades;
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
        rotation += grades;
        repaint();
    }
}
