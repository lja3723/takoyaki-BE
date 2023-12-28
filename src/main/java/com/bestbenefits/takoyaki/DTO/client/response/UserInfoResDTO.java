package com.bestbenefits.takoyaki.DTO.client.response;


import com.bestbenefits.takoyaki.config.properties.oauth.OAuthSocialType;
import lombok.Builder;
import lombok.Getter;

@Builder
public record UserInfoResDTO(String nickname, OAuthSocialType social, String email) {}
