package com.vinaya;

import javax.swing.*;

public class CloseBugFrame extends JFrame {
    public CloseBugFrame() {
        setTitle("Close Bug");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel idLabel = new JLabel("Bug ID:");
        idLabel.setBounds(20, 20, 80, 25);
        add(idLabel);

        JTextField idField = new JTextField();
        idField.setBounds(100, 20, 150, 25);
        add(idField);

        JButton closeButton = new JButton("Close Bug");
        closeButton.setBounds(100, 60, 120, 25);
        add(closeButton);

        closeButton.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            new BugDAO().closeBug(id);
            JOptionPane.showMessageDialog(this, "Bug closed!");
            idField.setText("");
        });

        setVisible(true);
    }
}

