package com.bestbenefits.takoyaki.config.properties.party;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public enum Category {
    대외활동("대외활동"),
    취업_스터디("취업/스터디"),
    OTT("OTT"),
    습관챌린지("습관 챌린지"),
    게임("게임"),
    소모임("소모임"),
    기타("기타");

    private final String name;

    Category(String name){
        this.name = name;
    }

    public static Category fromValue(String categoryName) {
        for (Category category : Category.values()) {
            if (category.name().equals(categoryName))
                return category;
        }
        throw new IllegalArgumentException("Invalid category name.");
    }
    public static List<String> toNameList(){
        return Arrays.stream(Category.values())
                .map(Category::getName)
                .collect(Collectors.toList());
    }
}
