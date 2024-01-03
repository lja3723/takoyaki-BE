package com.bestbenefits.takoyaki.service;

import com.bestbenefits.takoyaki.DTO.client.request.PartyCreationReqDTO;
import com.bestbenefits.takoyaki.config.apiresponse.ApiResponse;
import com.bestbenefits.takoyaki.config.properties.party.ActivityLocation;
import com.bestbenefits.takoyaki.config.properties.party.Category;
import com.bestbenefits.takoyaki.config.properties.party.ContactMethod;
import com.bestbenefits.takoyaki.config.properties.party.DurationUnit;
import com.bestbenefits.takoyaki.entity.Party;
import com.bestbenefits.takoyaki.entity.User;
import com.bestbenefits.takoyaki.repository.PartyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.bestbenefits.takoyaki.config.properties.party.DurationUnit.*;

@Service
@RequiredArgsConstructor
public class PartyService {
    private final PartyRepository partyRepository;
    private final UserService userService;
    @Transactional
    public Long createParty(Long userId, PartyCreationReqDTO dto) {
        User user = userService.getUser(userId);
        if (user == null) return 0L; //UserId가 잘못된 경우 (여기에 써도 되나)

        int activityDuration = dto.getActivityDuration();
        switch(DurationUnit.valueOf(dto.getActivityDurationUnit())) {
            case 일:
                break;
            case 주:
                activityDuration *= 7;
                break;
            case 달:
                activityDuration *= 30;
                break;
            case 년:
                activityDuration *= 365;
                break;
        }

        Party party = Party.builder()
                .category(Category.valueOf(dto.getCategory()))
                .activityLocation(ActivityLocation.valueOf(dto.getActivityLocation()))
                .contactMethod(ContactMethod.valueOf(dto.getContactMethod()))
                .title(dto.getTitle())
                .body(dto.getBody())
                .activityDuration(activityDuration)
                .recruitNumber(dto.getRecruitNumber())
                .contact(dto.getContact())
                .plannedClosingDate(dto.getPlannedClosingDate())
                .user(user)
                .build();

        System.out.println(party.toString());
        partyRepository.save(party);

        return party.getId();
    }
}