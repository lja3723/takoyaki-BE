package com.bestbenefits.takoyaki.DTO.client.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PartyCreationReqDTO {
    @NotBlank
    private String category;
    @NotBlank
    private String activityLocation;
    @NotBlank
    private String title;
    @NotBlank
    private String body;
    @NotNull
    @Min(value=1)
    private Integer recruitNumber;
    @Future
    private String plannedClosingDate;
    @NotBlank
    private String activityDuration; //
    @NotBlank
    private String contact;

    @Override
    public String toString() {
        return "PartyCreationReqDTO{" +
                "category='" + category + '\'' +
                ", activityLocation='" + activityLocation + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", recruitNumber=" + recruitNumber +
                ", plannedClosingDate='" + plannedClosingDate + '\'' +
                ", activityDuration='" + activityDuration + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
