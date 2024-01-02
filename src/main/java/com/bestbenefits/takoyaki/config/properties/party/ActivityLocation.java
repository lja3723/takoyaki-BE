package com.bestbenefits.takoyaki.config.properties.party;

import com.bestbenefits.takoyaki.config.properties.oauth.OAuthSocialType;

import java.util.Arrays;
import java.util.List;

public enum ActivityLocation {
    온라인, 서울, 경기도, 충청도, 전라도, 강원도, 경상도, 제주도;

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