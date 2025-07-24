package com.vinaya;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBugFrame extends JFrame {
    public AddBugFrame() {
        setTitle("Add Bug");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel descLabel = new JLabel("Description:");
        descLabel.setBounds(20, 20, 80, 25);
        add(descLabel);

        JTextField descField = new JTextField();
        descField.setBounds(110, 20, 150, 25);
        add(descField);

        JLabel priorityLabel = new JLabel("Priority:");
        priorityLabel.setBounds(20, 60, 80, 25);
        add(priorityLabel);

        String[] priorities = {"HIGH", "MEDIUM", "LOW"};
        JComboBox<String> priorityBox = new JComboBox<>(priorities);
        priorityBox.setBounds(110, 60, 150, 25);
        add(priorityBox);

        JButton addButton = new JButton("Add");
        addButton.setBounds(100, 100, 80, 25);
        add(addButton);

        addButton.addActionListener(e -> {
            String desc = descField.getText();
            String priority = (String) priorityBox.getSelectedItem();
            Bug bug = new Bug(desc, priority);
            new BugDAO().addBug(bug);
            JOptionPane.showMessageDialog(this, "Bug added!");
            descField.setText("");
        });

        setVisible(true);
    }
}

