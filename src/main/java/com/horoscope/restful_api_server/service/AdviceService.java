package com.horoscope.restful_api_server.service;

import com.horoscope.restful_api_server.model.Advice;
import com.horoscope.restful_api_server.repo.AdviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AdviceService {
    @Autowired
    private AdviceRepository adviceRepository;

    public Advice getAdvice(int adviceId) {
        return adviceRepository.findById(adviceId).isPresent() ? adviceRepository.findById(adviceId).get() : null;
    }

    public List<Integer> getRandomAdviceIdsByCategoryId(int categoryId) {
        Random random = new Random();
        List<Advice> advices = adviceRepository.findAllByCategoryId(categoryId);
        return List.of(
                advices.get(random.nextInt(advices.size())).getId(),
                advices.get(random.nextInt(advices.size())).getId(),
                advices.get(random.nextInt(advices.size())).getId());
    }

    public List<Advice> getAdvices(List<Integer> ids) {
        List<Advice> result = new ArrayList<>();
        ids.forEach(id -> result.add(getAdvice(id)));
        return result;
    }
}
