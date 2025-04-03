package com.horoscope.restful_api_server.service;

import com.horoscope.restful_api_server.model.Overview;
import com.horoscope.restful_api_server.repo.OverviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class OverviewService {
    @Autowired
    private OverviewRepository overviewRepository;

    public Overview getOverview(int overviewId) {
        return overviewRepository.findById(overviewId).isPresent()
                ? overviewRepository.findById(overviewId).get() : null;
    }

    public List<Overview> getRandomOverviews() {
        Random random = new Random();
        List<Overview> overviews = overviewRepository.findAll();
        return List.of(
                overviews.get(random.nextInt(overviews.size())),
                overviews.get(random.nextInt(overviews.size())),
                overviews.get(random.nextInt(overviews.size()))
        );
    }

    public int getRandomOverviewIdByCategory(int categoryId) {
        Random random = new Random();
        List<Overview> overviews = overviewRepository.findAllByCategoryId(categoryId);
        return overviews.get(random.nextInt(overviews.size())).getId();
    }
}
