package com.horoscope.restful_api_server.dto;

import com.horoscope.restful_api_server.model.Advice;
import com.horoscope.restful_api_server.model.Category;
import com.horoscope.restful_api_server.model.Horoscope;
import com.horoscope.restful_api_server.model.Overview;

import java.time.LocalDate;
import java.util.List;

public class HoroscopeCategoryDto {
    private Horoscope horoscope;
    private Category category;
    private LocalDate dayTime;
    private int score;
    private Overview overview;
    private List<Advice> advices;

    public HoroscopeCategoryDto(){}

    public HoroscopeCategoryDto(Horoscope horoscope, Category category, LocalDate dayTime, int score, Overview overview, List<Advice> advices) {
        this.horoscope = horoscope;
        this.category = category;
        this.dayTime = dayTime;
        this.score = score;
        this.overview = overview;
        this.advices = advices;
    }

    public void setHoroscope(Horoscope horoscope) {
        this.horoscope = horoscope;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDayTime(LocalDate dayTime) {
        this.dayTime = dayTime;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setOverview(Overview overview) {
        this.overview = overview;
    }

    public void setAdvice(List<Advice> advices) {
        this.advices = advices;
    }

    public Horoscope getHoroscope() {
        return horoscope;
    }

    public Category getCategory() {
        return category;
    }

    public LocalDate getDayTime() {
        return dayTime;
    }

    public int getScore() {
        return score;
    }

    public Overview getOverview() {
        return overview;
    }

    public List<Advice> getAdvice() {
        return advices;
    }
}
