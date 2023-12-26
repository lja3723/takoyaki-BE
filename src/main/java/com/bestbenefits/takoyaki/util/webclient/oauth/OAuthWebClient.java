package com.bestbenefits.takoyaki.util.webclient.oauth;

import com.bestbenefits.takoyaki.DTO.server.response.TokensResDTO;
import com.bestbenefits.takoyaki.DTO.server.response.SocialUserInfoResDTO;

public interface OAuthWebClient {
    TokensResDTO requestTokens(String code);
    String requestAccessToken(String refreshToken);
    SocialUserInfoResDTO requestUserInfo(String accessToken);
}