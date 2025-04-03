package com.horoscope.restful_api_server.controller;

import com.horoscope.restful_api_server.dto.HoroscopeCategoryDto;
import com.horoscope.restful_api_server.model.Horoscope;
import com.horoscope.restful_api_server.service.HoroscopeCategoryService;
import com.horoscope.restful_api_server.service.HoroscopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class HoroscopeController {
    @Autowired
    private HoroscopeService horoscopeService;
    @Autowired
    private HoroscopeCategoryService horoscopeCategoryService;

    @GetMapping("horoscope")
    public List<Horoscope> getHoroscope() {
        return horoscopeService.getHoroscopes();
    }

    @GetMapping("horoscope/{horoscopeId}/daily")
    public List<HoroscopeCategoryDto> getHoroscopeCategories(@PathVariable int horoscopeId) {
        return horoscopeCategoryService.getHoroscopeCategories(horoscopeId);
    }
}
