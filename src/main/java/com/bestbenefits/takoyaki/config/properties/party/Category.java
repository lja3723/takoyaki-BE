package com.bestbenefits.takoyaki.config.properties.party;

import java.util.Arrays;
import java.util.List;

public enum Category {
    프로그래밍, OTT, 공모전, 스터디;

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
