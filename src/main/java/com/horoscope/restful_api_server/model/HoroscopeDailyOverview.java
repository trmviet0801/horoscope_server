package com.horoscope.restful_api_server.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "horoscope_and_daily_overview", schema = "public")
public class HoroscopeDailyOverview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false)
    private int id;
    @Column(name = "horoscope_id")
    private int horoscopeId;
    @Column(name = "daily_overview_id")
    private int dailyOverviewId;
    @Column(name = "date_time")
    private LocalDate dayTime;

    public HoroscopeDailyOverview() {}

    public HoroscopeDailyOverview(int horoscopeId, int dailyOverviewId, LocalDate dayTime) {
        this.horoscopeId = horoscopeId;
        this.dailyOverviewId = dailyOverviewId;
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

    public void setDailyOverviewId(int dailyOverviewId) {
        this.dailyOverviewId = dailyOverviewId;
    }

    public void setDayTime(LocalDate dayTime) {
        this.dayTime = dayTime;
    }

    public int getHoroscopeId() {
        return horoscopeId;
    }

    public int getDailyOverviewId() {
        return dailyOverviewId;
    }

    public LocalDate getDayTime() {
        return dayTime;
    }
}
