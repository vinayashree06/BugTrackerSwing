package com.vinaya;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BugDAO {

    public void addBug(Bug bug) {
        String sql = "INSERT INTO bugs (description, priority, status) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, bug.getDescription());
            ps.setString(2, bug.getPriority());
            ps.setString(3, bug.getStatus());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Bug> getAllBugs() {
        List<Bug> list = new ArrayList<>();
        String sql = "SELECT * FROM bugs";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Bug bug = new Bug(
                        rs.getInt("id"),
                        rs.getString("description"),
                        rs.getString("priority"),
                        rs.getString("status")
                );
                list.add(bug);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void closeBug(int id) {
        String sql = "UPDATE bugs SET status = 'CLOSED' WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

