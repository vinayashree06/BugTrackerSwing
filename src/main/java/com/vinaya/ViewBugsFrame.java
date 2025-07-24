package com.vinaya;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ViewBugsFrame extends JFrame {
    public ViewBugsFrame() {
        setTitle("View Bugs");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columns = {"ID", "Description", "Priority", "Status"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        List<Bug> bugs = new BugDAO().getAllBugs();
        for (Bug b : bugs) {
            model.addRow(new Object[]{b.getId(), b.getDescription(), b.getPriority(), b.getStatus()});
        }

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        setVisible(true);
    }
}

