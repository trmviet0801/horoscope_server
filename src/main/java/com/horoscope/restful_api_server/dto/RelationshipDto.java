package com.horoscope.restful_api_server.dto;

import com.horoscope.restful_api_server.model.Horoscope;

import java.util.List;

public class RelationshipDto {
    private Horoscope firstSign;
    private Horoscope secondSign;
    private int relationshipId;
    private String status;
    private String description;
    private String emotionalConnection;
    private String communication;
    private String physicalChemistry;
    private String trustAndLoyalty;
    private List<String> advices;
    private String potential;

    public RelationshipDto(){}

    public RelationshipDto(Horoscope firstSign, Horoscope secondSign, int relationshipId, String status, String description, String emotionalConnection, String communication, String physicalChemistry, String trustAndLoyalty, List<String> advices, String potential) {
        this.firstSign = firstSign;
        this.secondSign = secondSign;
        this.relationshipId = relationshipId;
        this.status = status;
        this.description = description;
        this.emotionalConnection = emotionalConnection;
        this.communication = communication;
        this.physicalChemistry = physicalChemistry;
        this.trustAndLoyalty = trustAndLoyalty;
        this.advices = advices;
        this.potential = potential;
    }

    public void setPotential(String potential) {
        this.potential = potential;
    }

    public String getPotential() {
        return potential;
    }

    public void setRelationshipId(int relationshipId) {
        this.relationshipId = relationshipId;
    }

    public int getRelationshipId() {
        return relationshipId;
    }

    public void setFirstSign(Horoscope firstSign) {
        this.firstSign = firstSign;
    }

    public void setSecondSign(Horoscope secondSign) {
        this.secondSign = secondSign;
    }

    public Horoscope getFirstSign() {
        return firstSign;
    }

    public Horoscope getSecondSign() {
        return secondSign;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void setAdvices(List<String> advices) {
        this.advices = advices;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
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

    public List<String> getAdvices() {
        return advices;
    }
}
