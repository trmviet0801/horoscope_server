package com.horoscope.restful_api_server.controller;

import com.horoscope.restful_api_server.model.Horoscope;
import com.horoscope.restful_api_server.service.HoroscopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class HoroscopeController {
    @Autowired
    private HoroscopeService horoscopeService;

    @GetMapping("horoscope")
    public List<Horoscope> getHoroscope() {
        return horoscopeService.getHoroscopes();
    }
}
