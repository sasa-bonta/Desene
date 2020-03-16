package com.company.Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab2 {

    public static void main(String[] args) {
        DrawPanelLab2 panel = new DrawPanelLab2();

        Deplasare deplasare = new Deplasare();
        deplasare.setPreferredSize(new Dimension(900, 600));

        Scalare scalare = new Scalare();
        scalare.setPreferredSize(new Dimension(900, 600));

        Rotire rotire = new Rotire();
        rotire.setPreferredSize(new Dimension(900, 600));

        JButton b = new JButton("Rotire");
            JButton b2 = new JButton("Scalare");
            JButton b3 = new JButton("Deplasare");
            b.setBounds(100,700,140, 40);
            b2.setBounds(300,700,140, 40);
            b3.setBounds(500,700,140, 40);

            JFrame application = new JFrame();
            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            application.add(b);
            application.add(b2);
            application.add(b3);
            application.add(panel);
            application.setSize(900, 900);
            application.setVisible(true);

        b.addActionListener(new ActionListener() {
            //Rotire
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JFrame application1 = new JFrame("Rotire 25gr");
                //application1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                application1.setSize(300, 300);
                application1.add(rotire);
                application1.setVisible(true);

            }
        });

        b2.addActionListener(new ActionListener() {
            //Scalare
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JFrame application2 = new JFrame("Scalare 0.5");
                //application2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                application2.setSize(300, 300);
                application2.add(scalare);
                application2.setVisible(true);
            }
        });

        b3.addActionListener(new ActionListener() {
            //Deplasare
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JFrame application3 = new JFrame("Deplasare X : 10; Y : 20");
                //application3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                application3.setSize(400, 500);
                application3.add(deplasare);
                application3.setVisible(true);
            }
        });
    }
}


