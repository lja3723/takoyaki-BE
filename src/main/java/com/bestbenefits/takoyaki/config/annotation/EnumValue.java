package com.bestbenefits.takoyaki.config.annotation;

import com.bestbenefits.takoyaki.config.constraint_validator.EnumValueValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EnumValueValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface EnumValue {
    String message() default "enum 값이 잘못되었습니다.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    Class<? extends Enum> enumClass();
}