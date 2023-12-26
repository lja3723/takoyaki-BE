package com.bestbenefits.takoyaki.DTO.layer.request;

import com.bestbenefits.takoyaki.DTO.server.response.SocialUserInfoResDTO;
import com.bestbenefits.takoyaki.entity.User;
import lombok.Builder;
import lombok.Getter;

@Getter
public class OAuthSignUpReqDTO {
    private String email;
    private int social;

    @Builder
    public OAuthSignUpReqDTO(SocialUserInfoResDTO socialUserInfoResDTO, int social){
        this.email = socialUserInfoResDTO.getEmail();
        this.social = social;
    }
    public User toEntity(){
        return User.builder()
                .email(email)
                .social(social)
            .build();
    }
}
