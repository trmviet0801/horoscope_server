package com.horoscope.restful_api_server.service;

import com.horoscope.restful_api_server.dto.RelationshipDto;
import com.horoscope.restful_api_server.model.Horoscope;
import com.horoscope.restful_api_server.model.Relationship;
import com.horoscope.restful_api_server.repo.RelationshipRepository;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationshipService {
    @Autowired
    private RelationshipRepository relationshipRepository;
    @Autowired
    private HoroscopeService horoscopeService;


    public RelationshipDto getRelationshipByHoroscopeId(int firstId, int secondId) {
        if (firstId > secondId) {
            int temp = firstId;
            firstId = secondId;
            secondId = temp;
        }
        return relationshipRepository.findByHoroscopeFirstIdAndHoroscopeSecondId(firstId, secondId) != null
                ? convertToDto(relationshipRepository.findByHoroscopeFirstIdAndHoroscopeSecondId(firstId, secondId))
                : null;
    }

    public RelationshipDto convertToDto(Relationship relationship) {
        RelationshipDto dto = new RelationshipDto();
        Horoscope firstSign = horoscopeService.getHoroscopesById(relationship.getHoroscopeFirstId());
        Horoscope secondSign = horoscopeService.getHoroscopesById(relationship.getHoroscopeSecondId());

        dto.setDescription(relationship.getDescription());
        dto.setAdvices(relationship.getAdvices());
        dto.setCommunication(relationship.getCommunication());
        dto.setRelationshipId(relationship.getId());
        dto.setStatus(relationship.getStatus());
        dto.setEmotionalConnection(relationship.getEmotionalConnection());
        dto.setRelationshipId(relationship.getId());
        dto.setFirstSign(firstSign);
        dto.setSecondSign(secondSign);
        dto.setTrustAndLoyalty(relationship.getTrustAndLoyalty());
        dto.setPotential(relationship.getPotential());
        dto.setPhysicalChemistry(relationship.getPhysicalChemistry());

        return dto;
    }
}
