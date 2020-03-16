package com.company.Lab2;

import javax.swing.*;
import java.awt.*;


public class DrawPanelLab2 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        Color R = new Color(216, 22, 0);
        g.setColor(R);
        g.fillPolygon(new int [] {100, 250, 400}, new int [] {300, 20, 300}, 3);

        Color S = new Color(22, 216, 0);
        g.setColor(S);
        g.fillRect(500, 40,250, 250);


    }
}
