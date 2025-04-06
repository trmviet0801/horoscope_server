package com.horoscope.restful_api_server.controller;

import com.horoscope.restful_api_server.dto.RelationshipDto;
import com.horoscope.restful_api_server.service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RelationshipController {
    @Autowired
    private RelationshipService relationshipService;

    @GetMapping("/relationship/{firstId}/{secondId}")
    public RelationshipDto getRelationship(@PathVariable int firstId,@PathVariable int secondId) {
        return relationshipService.getRelationshipByHoroscopeId(firstId, secondId);
    }
}
