package com.company.Attestation;

import java.awt.*;
import javax.swing.JFrame;

public class LinesDrawingExample extends JFrame {
    public LinesDrawingExample() {
        super("Atestare FI 181 Bonta Alexandr");

        //Marimea panoului
        setSize(900, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //Cercul
        g2d.drawOval(40, 50,250, 250);
        //Triunghiul
        g2d.drawPolygon(new int [] {300, 450, 600}, new int [] {320, 40, 320}, 3);
        //Linia
        g2d.drawLine(30, 460, 450, 460);

        //Dreptunghiul
        g2d.setColor(Color.YELLOW); //Setam culoarea fonului
        g2d.fillRect(300, 500, 300, 200); //Desenam dreptunghiul

        //Conturul dreptunghiului
        g2d.setColor(Color.BLUE); //Setam culoarea conturului
        float[] dashingPattern2 = {10f, 4f};
        Stroke stroke = new BasicStroke(4f, BasicStroke.CAP_BUTT, //Setam grosimea si tipul liniei
                BasicStroke.JOIN_MITER, 1.0f, dashingPattern2, 0.0f);

        g2d.setStroke(stroke);
        g2d.drawRect(300, 500, 300, 200);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }

}
