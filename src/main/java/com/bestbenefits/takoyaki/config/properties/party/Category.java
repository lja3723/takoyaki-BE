package com.bestbenefits.takoyaki.config.properties.party;

import java.util.Arrays;
import java.util.List;

public enum Category {
    대외활동("대외활동", 0),
    취업_스터디("취업/스터디", 1),
    OTT("OTT", 2),
    습관챌린지("습관챌린지", 3),
    게임("게임", 4),
    소모임("소모임", 5),
    기타("기타", 6);

    private final String pascalName;
    private final int index;
    Category(String pascalName, int index){
        this.pascalName = pascalName;
        this.index = index;
    }

    public static Category fromValue(String categoryName) {
        for (Category category : Category.values()) {
            if (category.name().equals(categoryName))
                return category;
        }
        throw new IllegalArgumentException("Invalid category name.");
    }
    public static List<Category> toList(){
        return Arrays.stream(Category.values()).toList();
    }
}
