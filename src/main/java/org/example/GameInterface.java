package org.example;

import javax.swing.*;
import java.awt.*;

public class GameInterface {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Dashboard App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 850);
        frame.setLayout(new BorderLayout());

        // Header
        JPanel header = new JPanel();
        header.setLayout(new GridLayout(1, 3));
        header.add(createCircleLabel("95"));
        header.add(createCircleLabel("99"));
        header.add(createCircleLabel("02"));
        frame.add(header, BorderLayout.NORTH);
        frame.setResizable(false);

        // Main
        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());

        JPanel carPanel = new JPanel();
        carPanel.setPreferredSize(new Dimension(250, 150));
        carPanel.setBackground(Color.GRAY);
        main.add(carPanel, BorderLayout.NORTH);

        JPanel icons = new JPanel();
        icons.setLayout(new GridLayout(3, 4, 10, 10));
        for (int i = 1; i <= 12; i++) {
            icons.add(createCircleLabel(String.valueOf(i)));
        }
        main.add(icons, BorderLayout.CENTER);

        frame.add(main, BorderLayout.CENTER);

        // Footer
        JPanel footer = new JPanel();
        footer.setLayout(new GridLayout(1, 3));
        footer.add(createCircleLabel("00"));
        footer.add(createCircleLabel("00"));
        footer.add(createCircleLabel("00"));
        frame.add(footer, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private static JLabel createCircleLabel(String text) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.DARK_GRAY);
        label.setForeground(Color.WHITE);
        label.setPreferredSize(new Dimension(60, 60));
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        return label;
    }
}
