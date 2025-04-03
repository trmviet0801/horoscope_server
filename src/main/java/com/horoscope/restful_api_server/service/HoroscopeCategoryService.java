package com.horoscope.restful_api_server.service;

import com.horoscope.restful_api_server.dto.HoroscopeCategoryDto;
import com.horoscope.restful_api_server.exception.NotFoundException;
import com.horoscope.restful_api_server.model.HoroscopeCategory;
import com.horoscope.restful_api_server.repo.HoroscopeCategoryRepository;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class HoroscopeCategoryService {
    @Autowired
    private HoroscopeCategoryRepository horoscopeCategoryRepository;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private HoroscopeService horoscopeService;
    @Autowired
    private AdviceService adviceService;
    @Autowired
    private OverviewService overviewService;

    public HoroscopeCategoryDto getHoroscopeCategory(int horoscopeId, int categoryId) {
        HoroscopeCategoryDto dto = new HoroscopeCategoryDto();
        HoroscopeCategory horoscopeCategory = horoscopeCategoryRepository.findByDayTimeAndHoroscopeIdAndCategoryId(
                LocalDate.now(),
                horoscopeId,
                categoryId
        );

        if (horoscopeCategory == null) {
            horoscopeCategory = new HoroscopeCategory();
            horoscopeCategory.setCategoryId(categoryId);
            horoscopeCategory.setHoroscopeId(horoscopeId);
            horoscopeCategory.setAdviceId(adviceService.getRandomAdviceIdsByCategoryId(categoryId));
            horoscopeCategory.setOverviewId(overviewService.getRandomOverviewIdByCategory(categoryId));
            horoscopeCategory.setScore(getScore());
            horoscopeCategory.setDayTime(LocalDate.now());
            horoscopeCategoryRepository.saveAndFlush(horoscopeCategory);
        }
        return convertToDto(horoscopeCategory);
    }

    public List<HoroscopeCategoryDto> getHoroscopeCategories(int horoscopeId) {
        List<HoroscopeCategoryDto> dtos = new ArrayList<>();
        categoryService.getCategories().forEach(category ->
                dtos.add(getHoroscopeCategory(horoscopeId, category.getCategoryId()))
                );
        return dtos;
    }

    public HoroscopeCategoryDto convertToDto(HoroscopeCategory horoscopeCategory) {
        HoroscopeCategoryDto dto = new HoroscopeCategoryDto();
        dto.setDayTime(horoscopeCategory.getDayTime());
        dto.setScore(horoscopeCategory.getScore());
        dto.setCategory(categoryService.getCategory(horoscopeCategory.getCategoryId()));
        dto.setHoroscope(horoscopeService.getHoroscopesById(horoscopeCategory.getHoroscopeId()));
        dto.setAdvice(adviceService.getAdvices(horoscopeCategory.getAdviceId()));
        dto.setOverview(overviewService.getOverview(horoscopeCategory.getOverviewId()));
        return dto;
    }

    public int getScore() {
        return new Random().nextInt(70, 100);
    }
}
