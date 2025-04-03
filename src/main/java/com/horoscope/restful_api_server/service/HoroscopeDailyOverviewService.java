package com.horoscope.restful_api_server.service;

import com.horoscope.restful_api_server.dto.HoroscopeDailyOverviewDto;
import com.horoscope.restful_api_server.exception.NoDataException;
import com.horoscope.restful_api_server.exception.NotFoundException;
import com.horoscope.restful_api_server.model.DailyOverview;
import com.horoscope.restful_api_server.model.Horoscope;
import com.horoscope.restful_api_server.model.HoroscopeDailyOverview;
import com.horoscope.restful_api_server.repo.HoroscopeDailyOverviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class HoroscopeDailyOverviewService {
    @Autowired
    private HoroscopeDailyOverviewRepository horoscopeDailyOverviewRepository;
    @Autowired
    private HoroscopeService horoscopeService;
    @Autowired
    private DailyOverviewService dailyOverviewService;

    public HoroscopeDailyOverviewDto getHoroscopeDailyOverview(int horoscopeId) throws NoDataException, NotFoundException {
        HoroscopeDailyOverviewDto dto = new HoroscopeDailyOverviewDto();
        HoroscopeDailyOverview horoscopeDailyOverview = horoscopeDailyOverviewRepository.findByDayTimeAndHoroscopeId(LocalDate.now(), horoscopeId);
        Horoscope horoscope = horoscopeService.getHoroscopesById(horoscopeId);
        Optional<DailyOverview> dailyOverview = dailyOverviewService.getDailyOverview(horoscopeDailyOverview != null
                ? horoscopeDailyOverview.getDailyOverviewId() : -1);

        if (horoscopeDailyOverview == null) {
            dailyOverview = Optional.ofNullable(dailyOverviewService.getRandomDailyOverview());
            horoscopeDailyOverview = new HoroscopeDailyOverview(horoscopeId, dailyOverview.get().getId(), LocalDate.now());
            saveHoroscopeDailyOverview(horoscopeDailyOverview);
        }
        dto.setHoroscope(horoscope);
        dto.setDailyOverview(dailyOverview.get());
        dto.setDayTime(LocalDate.now());
        return dto;
    }

    public void saveHoroscopeDailyOverview(HoroscopeDailyOverview horoscopeDailyOverview) {
        horoscopeDailyOverviewRepository.saveAndFlush(horoscopeDailyOverview);
    }
}
