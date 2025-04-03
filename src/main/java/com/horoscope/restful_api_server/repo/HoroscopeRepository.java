package com.horoscope.restful_api_server.repo;

import com.horoscope.restful_api_server.model.Horoscope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoroscopeRepository extends JpaRepository<Horoscope, Integer> {
}
