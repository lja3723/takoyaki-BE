package com.bestbenefits.takoyaki.config.properties.party;

import com.bestbenefits.takoyaki.config.properties.oauth.OAuthSocialType;

import java.util.Arrays;
import java.util.List;

public enum ActivityLocation {
    전국, 온라인, 수도권, 강원, 충청, 전라, 경상, 제주;

    public static ActivityLocation fromValue(String activityLocationName) {
        for (ActivityLocation activityLocation : ActivityLocation.values()) {
            if (activityLocation.name().equals(activityLocationName))
                return activityLocation;
        }
        throw new IllegalArgumentException("Invalid activity location name.");
    }
    public static List<ActivityLocation> toList(){
        return Arrays.stream(ActivityLocation.values()).toList();
    }
}