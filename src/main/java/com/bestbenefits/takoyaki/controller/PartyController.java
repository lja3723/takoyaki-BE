package com.bestbenefits.takoyaki.controller;

import com.bestbenefits.takoyaki.DTO.client.request.PartyCreationReqDTO;
import com.bestbenefits.takoyaki.config.apiresponse.ApiResponse;
import com.bestbenefits.takoyaki.config.apiresponse.ApiResponseCreator;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}