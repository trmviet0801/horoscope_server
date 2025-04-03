package com.horoscope.restful_api_server.service;

import com.horoscope.restful_api_server.exception.NoDataException;
import com.horoscope.restful_api_server.model.DailyOverview;
import com.horoscope.restful_api_server.repo.DailyOverviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class DailyOverviewService {
    @Autowired
    private DailyOverviewRepository dailyOverviewRepository;

    public DailyOverview getRandomDailyOverview() throws NoDataException{
        Random random = new Random();
        List<DailyOverview> dailyOverviews = dailyOverviewRepository.findAll();
        if (dailyOverviews.isEmpty())
            throw new NoDataException(DailyOverviewService.class.getName() + " No current data for DailyOverview");
        return dailyOverviews.get(random.nextInt(dailyOverviews.size()));
    }

    public Optional<DailyOverview> getDailyOverview(int id) {
        return dailyOverviewRepository.findById(id);
    }
}
