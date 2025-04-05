package com.horoscope.restful_api_server.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

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
    @Column(name = "emotional_connection")
    private String emotionalConnection;
    @Column(name = "communication")
    private String communication;
    @Column(name = "physical_chemistry")
    private String physicalChemistry;
    @Column(name = "trust_and_loyalty")
    private String trustAndLoyalty;
    @Column(name = "potential")
    private String potential;
    @Column(name = "relationship_advices")
    private List<String> advices;

    public Relationship(){}

    public Relationship(int id, int horoscopeFirstId, int horoscopeSecondId, String status, String description, String emotionalConnection, String communication, String physicalChemistry, String trustAndLoyalty, String potential, List<String> advices) {
        this.id = id;
        this.horoscopeFirstId = horoscopeFirstId;
        this.horoscopeSecondId = horoscopeSecondId;
        this.status = status;
        this.description = description;
        this.emotionalConnection = emotionalConnection;
        this.communication = communication;
        this.physicalChemistry = physicalChemistry;
        this.trustAndLoyalty = trustAndLoyalty;
        this.potential = potential;
        this.advices = advices;
    }

    public void setEmotionalConnection(String emotionalConnection) {
        this.emotionalConnection = emotionalConnection;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public void setPhysicalChemistry(String physicalChemistry) {
        this.physicalChemistry = physicalChemistry;
    }

    public void setTrustAndLoyalty(String trustAndLoyalty) {
        this.trustAndLoyalty = trustAndLoyalty;
    }

    public void setPotential(String potential) {
        this.potential = potential;
    }

    public void setAdvices(List<String> advices) {
        this.advices = advices;
    }

    public String getEmotionalConnection() {
        return emotionalConnection;
    }

    public String getCommunication() {
        return communication;
    }

    public String getPhysicalChemistry() {
        return physicalChemistry;
    }

    public String getTrustAndLoyalty() {
        return trustAndLoyalty;
    }

    public String getPotential() {
        return potential;
    }

    public List<String> getAdvices() {
        return advices;
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
