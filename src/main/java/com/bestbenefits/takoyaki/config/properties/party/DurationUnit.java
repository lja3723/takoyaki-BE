package com.bestbenefits.takoyaki.config.properties.party;

import java.util.Arrays;
import java.util.List;

public enum DurationUnit {
    일, 주, 개월, 년;

    public static DurationUnit fromValue(String durationUnitName) {
        for (DurationUnit durationUnit : DurationUnit.values()) {
            if (durationUnit.name().equals(durationUnitName))
                return durationUnit;
        }
        throw new IllegalArgumentException("Invalid duration unit name.");
    }
}
