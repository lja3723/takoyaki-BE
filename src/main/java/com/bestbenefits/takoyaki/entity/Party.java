package com.bestbenefits.takoyaki.entity;

import com.bestbenefits.takoyaki.config.properties.party.ActivityLocation;
import com.bestbenefits.takoyaki.config.properties.party.Category;
import com.bestbenefits.takoyaki.config.properties.party.ContactMethod;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Enumerated(EnumType.STRING)
    private ActivityLocation activityLocation;

    @Enumerated(EnumType.STRING)
    private ContactMethod contactMethod;

    @Column(length = 100)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column
    private int recruitNumber;

    @Column
    private LocalDate plannedClosingDate;

    @Column
    private int activityDuration;

    @Column
    private String contact;

    @Column
    private Long viewCount;

    @Column
    private LocalDateTime deletedAt;

    @Column
    private LocalDateTime closedAt;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime modifiedAt;
    //    @CreatedDate
    //    @LastModifiedDate

    @Builder
    public Party(User user, Category category, ActivityLocation activityLocation, ContactMethod contactMethod, String title, String body, int recruitNumber, LocalDate plannedClosingDate, int activityDuration, String contact) {
        this.user = user;
        this.category = category;
        this.activityLocation = activityLocation;
        this.contactMethod = contactMethod;
        this.title = title;
        this.body = body;
        this.recruitNumber = recruitNumber;
        this.plannedClosingDate = plannedClosingDate;
        this.activityDuration = activityDuration;
        this.contact = contact;
        this.closedAt = LocalDateTime.now();
        this.createdAt = LocalDateTime.now();
        this.modifiedAt = LocalDateTime.now();
        this.viewCount = 0L;
        this.deletedAt = null;
    }

    @Override
    public String toString() {
        return "Party{" +
                "id=" + id +
                ", user=" + user +
                ", category=" + category +
                ", activityLocation=" + activityLocation +
                ", contactMethod=" + contactMethod +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", recruitNumber=" + recruitNumber +
                ", plannedClosingDate=" + plannedClosingDate +
                ", activityDuration=" + activityDuration +
                ", contact='" + contact + '\'' +
                ", viewCount=" + viewCount +
                ", deletedAt=" + deletedAt +
                ", closedAt=" + closedAt +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }

    public void updateDeleteAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }
}
