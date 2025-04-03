package com.horoscope.restful_api_server.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity(name = "horoscope")
public class Horoscope {
    @Id()
    @Column(name = "horoscope_id")
    private int id;
    @Column(name = "horoscope_name")
    private String name;
    @Column(name = "start_day")
    private String startDay;
    @Column(name = "end_date")
    private String endDay;
    @Column(name = "planet")
    private String planet;
    @Column(name = "element")
    private String element;
    @Column(name = "qualities")
    private List<String> qualities;

    public Horoscope() {}

    public Horoscope(int id, String name, String startDay, String endDay, String planet, String element, List<String> qualities) {
        this.id = id;
        this.name = name;
        this.startDay = startDay;
        this.endDay = endDay;
        this.planet = planet;
        this.element = element;
        this.qualities = qualities;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setQualities(List<String> qualities) {
        this.qualities = qualities;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStartDay() {
        return startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public String getPlanet() {
        return planet;
    }

    public String getElement() {
        return element;
    }

    public List<String> getQualities() {
        return qualities;
    }
}
