package com.vinaya;

public class Bug {
    private int id;
    private String description;
    private String priority;
    private String status;

    public Bug(int id, String description, String priority, String status) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    public Bug(String description, String priority) {
        this.description = description;
        this.priority = priority;
        this.status = "OPEN";
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getDescription() { return description; }
    public String getPriority() { return priority; }
    public String getStatus() { return status; }

    public void setId(int id) { this.id = id; }
    public void setDescription(String description) { this.description = description; }
    public void setPriority(String priority) { this.priority = priority; }
    public void setStatus(String status) { this.status = status; }
}

