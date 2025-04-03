package com.horoscope.restful_api_server.repo;

import com.horoscope.restful_api_server.model.HoroscopeCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface HoroscopeCategoryRepository extends JpaRepository<HoroscopeCategory, Integer> {
    HoroscopeCategory findByDayTimeAndHoroscopeIdAndCategoryId(LocalDate dayTime, int horoscopeId, int categoryId);
}
