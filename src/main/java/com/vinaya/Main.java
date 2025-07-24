package com.vinaya;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bug Tracker");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton addButton = new JButton("Add Bug");
        addButton.setBounds(50, 30, 120, 30);
        frame.add(addButton);

        JButton viewButton = new JButton("View Bugs");
        viewButton.setBounds(200, 30, 120, 30);
        frame.add(viewButton);

        JButton closeButton = new JButton("Close Bug");
        closeButton.setBounds(125, 80, 120, 30);
        frame.add(closeButton);

        addButton.addActionListener(e -> new AddBugFrame());
        viewButton.addActionListener(e -> new ViewBugsFrame());
        closeButton.addActionListener(e -> new CloseBugFrame());

        frame.setVisible(true);
    }
}

