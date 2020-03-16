package com.company.Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

public class Rotire extends JPanel implements ActionListener {
    Timer timer = new Timer(50, this);
    double rotation = 0, grades = 1;
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Color S = new Color(22, 216, 0);
        g.setColor(S);
        Rectangle square = new Rectangle(100, 100, 100, 100);
        g2.rotate(rotation/180, square.x + square.width/2, square.y + square.height/2);
        g2.fill(square);
        timer.start();
    }
    public void actionPerformed(ActionEvent ae) {
        if(rotation < 0 || rotation >= 25 ) {
            grades = -grades;
        }
        rotation += grades;
        repaint();
    }
}
