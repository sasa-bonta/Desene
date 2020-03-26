package com.company.Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

public class Scalare extends JPanel implements ActionListener {
    Timer timer = new Timer(50, this);
    double height = 100, width = 100, scalX = 1, scalY = 1, x = 100, y = 100;
    int red = 22, green = 216, blue = 0, r1 = 22, g1 = 216, b1 = 0, r2 = 216, g2 = 22, b2 = 0;
    int count = 0;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        Color S = new Color(red, green, blue);
        g.setColor(S);
        Rectangle2D square = new Rectangle2D.Double(x,y, height, width);
        g2.fill(square);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        if(height < x * 0.5 || height >= x ) {
            scalX = -scalX;

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
            count++;
        }
        if(width < y * 0.5 || width >= y ) {
            scalY = -scalY;
        }
        height += scalX;
        width += scalY;
        repaint();
    }
}
