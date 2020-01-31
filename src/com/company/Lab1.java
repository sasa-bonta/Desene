package com.company;

import javax.swing.*;

public class Lab1 {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(900, 900);
        application.setVisible(true);


    }
}
