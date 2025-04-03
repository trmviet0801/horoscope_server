package com.horoscope.restful_api_server.dto;

import com.horoscope.restful_api_server.model.DailyOverview;
import com.horoscope.restful_api_server.model.Horoscope;

import java.time.LocalDate;

public class HoroscopeDailyOverviewDto {
    private Horoscope horoscope;
    private DailyOverview dailyOverview;
    private LocalDate dayTime;

    public HoroscopeDailyOverviewDto(){}

    public HoroscopeDailyOverviewDto(DailyOverview dailyOverview, Horoscope horoscope, LocalDate dayTime) {
        this.dailyOverview = dailyOverview;
        this.horoscope = horoscope;
        this.dayTime = dayTime;
    }

    public void setHoroscope(Horoscope horoscope) {
        this.horoscope = horoscope;
    }

    public void setDailyOverview(DailyOverview dailyOverview) {
        this.dailyOverview = dailyOverview;
    }

    public void setDayTime(LocalDate dayTime) {
        this.dayTime = dayTime;
    }

    public Horoscope getHoroscope() {
        return horoscope;
    }

    public DailyOverview getDailyOverview() {
        return dailyOverview;
    }

    public LocalDate getDayTime() {
        return dayTime;
    }
}
