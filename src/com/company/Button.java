package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame {

    private final JButton plainJButton;
    public Button()
    {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainJButton = new JButton("Click on me"); // button with text
        add(plainJButton); // add plainJButton to JFrame

        // create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
       // fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener
    {
        // handle button event
        @Override
        public void actionPerformed(ActionEvent event)
        {
            DrawPanel panel = new DrawPanel();

            JFrame application = new JFrame();
            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            application.add(panel);
            application.setSize(900, 900);
            application.setVisible(true);
        }
    }
}
