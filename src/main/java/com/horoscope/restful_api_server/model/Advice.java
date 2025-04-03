package com.horoscope.restful_api_server.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "advice")
public class Advice {
    @Id
    @Column(name = "advice_id")
    private int id;
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "description")
    private String description;

    public Advice(){}

    public Advice(int id, int categoryId, String description) {
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
