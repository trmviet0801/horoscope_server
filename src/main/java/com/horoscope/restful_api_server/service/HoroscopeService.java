package com.horoscope.restful_api_server.service;

import com.horoscope.restful_api_server.model.Horoscope;
import com.horoscope.restful_api_server.repo.HoroscopeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoroscopeService {
    @Autowired
    private HoroscopeRepository horoscopeRepository;

    public List<Horoscope> getHoroscopes() {
        return horoscopeRepository.findAll();
    }
}
