package com.horoscope.restful_api_server.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "relationship")
public class Relationship {
    @Id
    @Column(name = "relationship_id")
    private int id;
    @Column(name = "horoscope_first_id")
    private int horoscopeFirstId;
    @Column(name = "horoscope_second_id")
    private int horoscopeSecondId;
    @Column(name = "status")
    private String status;
    @Column(name = "description")
    private String description;

    public Relationship(){}

    public Relationship(int id, int horoscopeFirstId, int horoscopeSecondId, String status, String description) {
        this.id = id;
        this.horoscopeFirstId = horoscopeFirstId;
        this.horoscopeSecondId = horoscopeSecondId;
        this.status = status;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoroscopeFirstId(int horoscopeFirstId) {
        this.horoscopeFirstId = horoscopeFirstId;
    }

    public void setHoroscopeSecondId(int horoscopeSecondId) {
        this.horoscopeSecondId = horoscopeSecondId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getHoroscopeFirstId() {
        return horoscopeFirstId;
    }

    public int getHoroscopeSecondId() {
        return horoscopeSecondId;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
