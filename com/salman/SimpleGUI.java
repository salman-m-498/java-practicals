package com.salman;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Simple Java GUI");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use absolute positioning

        // Create a JLabel (text display)
        JLabel label = new JLabel("Click the button!");
        label.setBounds(150, 50, 200, 30); // Set position and size
        frame.add(label);

        // Create a JButton (button)
        JButton button = new JButton("Click Me");
        button.setBounds(150, 100, 100, 30); // Set position and size
        frame.add(button);

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
