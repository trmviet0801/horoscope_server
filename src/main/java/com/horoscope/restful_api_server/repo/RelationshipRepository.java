package com.horoscope.restful_api_server.repo;

import com.horoscope.restful_api_server.model.Relationship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RelationshipRepository extends JpaRepository<Relationship, Integer> {
    Relationship findByHoroscopeFirstIdAndHoroscopeSecondId(int horoscopeFirstId, int horoscopeSecondId);
}
