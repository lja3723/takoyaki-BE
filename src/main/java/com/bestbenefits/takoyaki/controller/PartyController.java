package com.bestbenefits.takoyaki.controller;

import com.bestbenefits.takoyaki.DTO.client.request.PartyCreationReqDTO;
import com.bestbenefits.takoyaki.config.apiresponse.ApiResponse;
import com.bestbenefits.takoyaki.config.apiresponse.ApiResponseCreator;
import com.bestbenefits.takoyaki.config.properties.party.ActivityLocation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/party")
public class PartyController {

    @PostMapping
    public ApiResponse<?> createParty(@RequestBody @Valid PartyCreationReqDTO partyCreationReqDTO){
        System.out.println(partyCreationReqDTO.toString());
        //카테고리, 활동지역, 연락수단 존재하는건지 확인

        //예정 마감 일시가 작성 일시 이후인지 확인

        //활동 기간 1이상 정수인지

        //모집명 1이상 정수인지

        //제목 100자인지



        return ApiResponseCreator.success("1");
    }

    @GetMapping("/activity-location")
    public ApiResponse<?> getActivityLocation() {
        Map<String, Object> data = new HashMap<>();
        data.put("activity-location", ActivityLocation.values());
        return ApiResponseCreator.success(data);
    }
}