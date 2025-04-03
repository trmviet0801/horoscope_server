package com.horoscope.restful_api_server.repo;

import com.horoscope.restful_api_server.model.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdviceRepository extends JpaRepository<Advice, Integer> {
    List<Advice> findAllByCategoryId(int categoryId);
}
