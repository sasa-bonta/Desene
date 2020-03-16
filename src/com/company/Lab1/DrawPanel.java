package com.company.Lab1;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        Color myColor = new Color(124, 216, 111);
        g.setColor(myColor);
        g.fillRect(0, 0,width, height);
        g.setColor(Color.BLACK);
        g.drawLine(20, 20, 250, 250);
        g.setColor(Color.BLUE);
        g.fillRect(620, 120,250, 100);
        g.setColor(Color.RED);
        g.fillOval(620, 320,250, 250);
        g.setColor(Color.GRAY);
        g.fillPolygon(new int [] {300, 450, 600}, new int [] {300, 20, 300}, 3);
        g.setColor(Color.GREEN);
        g.fillPolygon(new int [] {20, 160, 300, 250, 70}, new int [] {428, 320, 428, 570, 570}, 5);
        g.setColor(Color.MAGENTA);
        g.fillOval(20, 670, 250, 100);

        myColor = new Color(216, 59, 184);
        g.setColor(myColor);
        g.fillPolygon(new int [] {350, 600, 570, 320}, new int [] {428, 428, 530, 530}, 4);

//        g.setColor(Color.BLACK);
//        g.drawLine(350, 428, 370, 408);
//        g.drawLine(600, 428, 620, 408);
//        g.drawLine(570, 530, 590, 510);
//
//        g.drawLine(370, 408, 620, 408);
//        g.drawLine(620, 408, 590, 510);

        myColor = new Color(175, 114, 108);
        g.setColor(myColor);
        g.fillPolygon(new int [] {350, 370, 620, 600}, new int [] {428, 408, 408, 428}, 4);

        myColor = new Color(155, 81, 114);
        g.setColor(myColor);
        g.fillPolygon(new int [] {620, 600, 570, 590}, new int [] {408, 428, 530, 510}, 4);

        g.setColor(Color.ORANGE);
        g.fillArc(350, 650, 250, 250, 45, 90);
        g.setColor(Color.YELLOW);
        g.fillArc(600, 650, 250, 100, 30, -120);

    }
}
