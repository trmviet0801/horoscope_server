package com.horoscope.restful_api_server.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "overview")
public class Overview {
    @Id
    @Column(name = "overview_id")
    private int id;
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "description")
    private String description;

    public Overview(){}

    public Overview(int id, int categoryId, String description) {
        this.id = id;
        this.categoryId = categoryId;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getDescription() {
        return description;
    }
}
