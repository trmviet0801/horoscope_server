package com.horoscope.restful_api_server.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "daily_overview")
public class DailyOverview {
    @Id
    @Column(name = "daily_overview_id")
    private int id;
    @Column(name = "mood")
    private String mood;
    @Column(name = "lucky_time")
    private String luckyTime;
    @Column(name = "power_time")
    private String powerTime;
    @Column(name = "lucky_numbers")
    private List<String> luckyNumbers;
    @Column(name = "description")
    private String description;

    public DailyOverview(){}
    public DailyOverview(int id, String mood, String luckyTime, String powerTime, List<String> luckyNumbers, String description) {
        this.id = id;
        this.mood = mood;
        this.luckyTime = luckyTime;
        this.powerTime = powerTime;
        this.luckyNumbers = luckyNumbers;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void setLuckyTime(String luckyTime) {
        this.luckyTime = luckyTime;
    }

    public void setPowerTime(String powerTime) {
        this.powerTime = powerTime;
    }

    public void setLuckyNumbers(List<String> luckyNumbers) {
        this.luckyNumbers = luckyNumbers;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getMood() {
        return mood;
    }

    public String getLuckyTime() {
        return luckyTime;
    }

    public String getPowerTime() {
        return powerTime;
    }

    public List<String> getLuckyNumbers() {
        return luckyNumbers;
    }

    public String getDescription() {
        return description;
    }
}
