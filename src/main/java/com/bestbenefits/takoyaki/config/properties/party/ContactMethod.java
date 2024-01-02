package com.bestbenefits.takoyaki.config.properties.party;

import java.util.Arrays;
import java.util.List;

public enum ContactMethod {
    카카오톡, 문자, 인스타그램;

    public static ContactMethod fromValue(String contactMethodName) {
        for (ContactMethod contactMethod : ContactMethod.values()) {
            if (contactMethod.name().equals(contactMethodName))
                return contactMethod;
        }
        throw new IllegalArgumentException("Invalid contact method name.");
    }
    public static List<ContactMethod> toList(){
        return Arrays.stream(ContactMethod.values()).toList();
    }
}
