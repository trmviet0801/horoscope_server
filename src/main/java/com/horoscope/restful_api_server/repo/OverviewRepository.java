package com.horoscope.restful_api_server.repo;

import com.horoscope.restful_api_server.model.Overview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OverviewRepository extends JpaRepository<Overview, Integer> {
    List<Overview> findAllByCategoryId(int categoryId);
}
