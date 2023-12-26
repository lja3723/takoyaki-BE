package com.bestbenefits.takoyaki.DTO.client.response;


import lombok.Builder;
import lombok.Getter;

@Builder
public record UserInfoResDTO(String nickname, String social, String email) {}
