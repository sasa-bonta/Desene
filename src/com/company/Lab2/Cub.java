package com.company.Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cub extends JPanel implements ActionListener {
    Timer timer = new Timer(1, this);
    double rotation = 0, grades = 1;

    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Color S1 = new Color(216, 59, 184);
        Color S2 = new Color(175, 114, 108);
        Color S3 = new Color(155, 81, 114);

        Polygon cub1 = new Polygon(new int [] {27, 27, 70, 70}, new int [] {95, 45, 20, 70}, 4);
        Polygon cub2 = new Polygon(new int [] {70, 113, 113, 70}, new int [] {20, 45, 95, 70}, 4);
        Polygon cub3 = new Polygon(new int [] {113, 70, 27, 70}, new int [] {95, 70, 95, 120}, 4);
        g2.rotate(rotation/180, 70, 70);
        g.setColor(S1);
        g2.fill(cub1);
        g.setColor(S2);
        g2.fill(cub2);
        g.setColor(S3);
        g2.fill(cub3);
        timer.start();
    }
    public void actionPerformed(ActionEvent ae) {
        rotation += grades;
        repaint();
    }
}
