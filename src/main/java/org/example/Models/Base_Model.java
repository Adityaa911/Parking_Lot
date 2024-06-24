package org.example.Models;

import java.util.Date;

public abstract class Base_Model {
    private Long id;

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        CreatedAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Date CreatedAt;
    private Date LastModeifiedAt;

    public Date getLastModeifiedAt() {
        return LastModeifiedAt;
    }

    public void setLastModeifiedAt(Date lastModeifiedAt) {
        LastModeifiedAt = lastModeifiedAt;
    }
}
