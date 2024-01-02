package com.bestbenefits.takoyaki.DTO.client.request;

import com.bestbenefits.takoyaki.config.annotation.EnumValid;
import com.bestbenefits.takoyaki.config.properties.party.ActivityLocation;
import com.bestbenefits.takoyaki.config.properties.party.Category;
import com.bestbenefits.takoyaki.config.properties.party.ContactMethod;
import com.bestbenefits.takoyaki.config.properties.party.DurationUnit;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.*;
import lombok.Getter;

import java.time.LocalDate;


/*
{
    "category": "동아리",
    "activity_location": "광주광역시",
    "contact_method": "카카오톡",

    "title": "에코노베이션 27기 모집",
    "body": "열정있는 27기를 모집합니다!",
    "recruit_number": 5, // or 문자열
    "activity_duration": "1개월",
    "planned_closing_date": "2024-03-15",
    "contact": "https://카카오톡URL.."
}
 */

@Getter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PartyCreationReqDTO {
    //카테고리, 활동지역, 연락수단 존재하는건지 확인
    @EnumValid(enumClass = Category.class)
    private Category category; //enum

    @EnumValid(enumClass = ActivityLocation.class)
    private ActivityLocation activityLocation; //enum

    @EnumValid(enumClass = ContactMethod.class)
    private ContactMethod contactMethod; //enum

    //제목 100자인지 확인
    @NotBlank
    @Size(max = 100, message = "제목은 100자 이하여야 합니다.")
    private String title;

    @NotBlank
    private String body;

    //모집 인원수 1이상 정수인지 확인
    @NotNull
    @Positive(message = "모집 인원수는 1명 이상이어야 합니다.")
    private Integer recruitNumber;

    //활동 기간 1이상 정수인지 확인
    @NotNull
    @Positive(message = "활동 기간은 1 이상이어야 합니다.")
    private Integer activityDuration;

    //활동 기간 단위 검증
    @EnumValid(enumClass = DurationUnit.class)
    private DurationUnit activityDurationUnit;

    @Future(message = "마감 예정 일시는 미래여야 합니다.")
    private LocalDate plannedClosingDate;

    @NotBlank
    private String contact;
}
