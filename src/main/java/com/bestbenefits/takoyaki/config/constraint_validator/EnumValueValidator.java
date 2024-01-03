package com.bestbenefits.takoyaki.config.constraint_validator;

import com.bestbenefits.takoyaki.config.annotation.EnumValue;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EnumValueValidator implements ConstraintValidator<EnumValue, String> {
    private List<String> validEnumList;

    @Override
    public void initialize(EnumValue constraintAnnotation) {
        validEnumList = Arrays.stream(constraintAnnotation.enumClass().getEnumConstants())
                .map(Enum::name)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return validEnumList.contains(value);
    }
}
