package com.horoscope.restful_api_server.repo;

import com.horoscope.restful_api_server.model.HoroscopeDailyOverview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface HoroscopeDailyOverviewRepository extends JpaRepository<HoroscopeDailyOverview, Integer> {
    HoroscopeDailyOverview findByDayTime(LocalDate daytime);

    HoroscopeDailyOverview findByDayTimeAndHoroscopeId(LocalDate now, int horoscopeId);
}
