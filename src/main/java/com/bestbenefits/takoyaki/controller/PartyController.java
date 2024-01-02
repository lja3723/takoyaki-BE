package com.bestbenefits.takoyaki.controller;

import com.bestbenefits.takoyaki.DTO.client.request.PartyCreationReqDTO;
import com.bestbenefits.takoyaki.config.annotation.Session;
import com.bestbenefits.takoyaki.config.apiresponse.ApiResponse;
import com.bestbenefits.takoyaki.config.apiresponse.ApiResponseCreator;
import com.bestbenefits.takoyaki.config.properties.SessionConst;
import com.bestbenefits.takoyaki.config.properties.party.ActivityLocation;
import com.bestbenefits.takoyaki.config.properties.party.Category;
import com.bestbenefits.takoyaki.config.properties.party.ContactMethod;
import com.bestbenefits.takoyaki.service.PartyService;
import com.bestbenefits.takoyaki.service.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class PartyController {
    private final PartyService partyService;
    private final UserService userService;

    @PostMapping("/party")
    public ApiResponse<?> createParty(/*@Session(attribute = SessionConst.ID) Long userId, */@RequestBody @Valid PartyCreationReqDTO dto) {
        Long partyId = partyService.createParty(/*userId*/0L, dto);
        Map<String, Long> data = new HashMap<>();
        data.put("id", partyId);
        return ApiResponseCreator.success(data);
    }

    @GetMapping("/activity-location")
    public ApiResponse<?> getActivityLocation() {
        Map<String, Object> data = new HashMap<>();
        data.put("activity-location", ActivityLocation.values());
        return ApiResponseCreator.success(data);
    }

    @GetMapping("/category")
    public ApiResponse<?> getCategory() {
        Map<String, Object> data = new HashMap<>();
        data.put("category", Category.values());
        return ApiResponseCreator.success(data);
    }

    @GetMapping("contact-method")
    public ApiResponse<?> getContactMethod() {
        Map<String, Object> data = new HashMap<>();
        data.put("contact-method", ContactMethod.values());
        return ApiResponseCreator.success(data);
    }

}