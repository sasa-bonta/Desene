package com.company.Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

public class Scalare extends JPanel implements ActionListener {
    Timer timer = new Timer(50, this);
    double height = 100, width = 100, scalX = 1, scalY = 1, x = 100, y = 100;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        Color S = new Color(22, 216, 0);
        g.setColor(S);
        Rectangle2D square = new Rectangle2D.Double(x,y, height, width);
        g2.fill(square);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        if(height < x * 0.5 || height >= x ) {

            scalX = -scalX;
        }
        if(width < y * 0.5 || width >= y ) {
            scalY = -scalY;
        }
        height += scalX;
        width += scalY;
        repaint();
    }
}
