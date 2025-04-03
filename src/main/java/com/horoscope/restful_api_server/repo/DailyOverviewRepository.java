package com.horoscope.restful_api_server.repo;

import com.horoscope.restful_api_server.model.DailyOverview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyOverviewRepository extends JpaRepository<DailyOverview, Integer> {
}
