package com.horoscope.restful_api_server.controller;

import com.horoscope.restful_api_server.dto.HoroscopeDailyOverviewDto;
import com.horoscope.restful_api_server.exception.NoDataException;
import com.horoscope.restful_api_server.exception.NotFoundException;
import com.horoscope.restful_api_server.service.HoroscopeDailyOverviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HoroscopeDailyOverviewController {
    @Autowired
    private HoroscopeDailyOverviewService horoscopeDailyOverviewService;

    @GetMapping("daily/overview/{horoscopeId}")
    public HoroscopeDailyOverviewDto getHoroscopeDailyOverview(@PathVariable int horoscopeId) throws NoDataException, NotFoundException {
        return horoscopeDailyOverviewService.getHoroscopeDailyOverview(horoscopeId);
    }
}
