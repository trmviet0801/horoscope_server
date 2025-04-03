package com.horoscope.restful_api_server.service;

import com.horoscope.restful_api_server.repo.RelationshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationshipService {
    @Autowired
    private RelationshipRepository relationshipRepository;
}
