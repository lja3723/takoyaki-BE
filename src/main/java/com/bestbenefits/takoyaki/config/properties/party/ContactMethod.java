package com.bestbenefits.takoyaki.config.properties.party;

import java.util.Arrays;
import java.util.List;

public enum ContactMethod {
    KAKAO_OPENCHAT( "카카오톡 오픈채팅", 0),
    EMAIL("이메일", 1),
    CELLPHONE_NUM("전화번호", 2);

    private final String pascalName;
    private final int index;
    ContactMethod(String pascalName, int index){
        this.pascalName = pascalName;
        this.index = index;
    }

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
