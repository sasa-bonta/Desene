package com.company.Attestation;

import javax.swing.*;

public class AttestationDrive {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LinesDrawingExample().setVisible(true);
            }
        });
    }
}
