package com.horoscope.restful_api_server.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "horoscope_and_category")
public class HoroscopeCategory {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "horoscope_id")
    private int horoscopeId;
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "overview_id")
    private int overviewId;
    @Column(name = "advice_id")
    private List<Integer> adviceId;
    @Column(name = "score")
    private int score;
    @Column(name = "day_time")
    private LocalDate dayTime;

    public HoroscopeCategory(){}

    public HoroscopeCategory(int horoscopeId, int categoryId, int overviewId, List<Integer> adviceId, int score, LocalDate dayTime) {
        this.horoscopeId = horoscopeId;
        this.categoryId = categoryId;
        this.overviewId = overviewId;
        this.adviceId = adviceId;
        this.score = score;
        this.dayTime = dayTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setHoroscopeId(int horoscopeId) {
        this.horoscopeId = horoscopeId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setOverviewId(int overviewId) {
        this.overviewId = overviewId;
    }

    public void setAdviceId(List<Integer> adviceId) {
        this.adviceId = adviceId;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDayTime(LocalDate dayTime) {
        this.dayTime = dayTime;
    }

    public int getHoroscopeId() {
        return horoscopeId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public int getOverviewId() {
        return overviewId;
    }

    public List<Integer> getAdviceId() {
        return adviceId;
    }

    public int getScore() {
        return score;
    }

    public LocalDate getDayTime() {
        return dayTime;
    }
}
