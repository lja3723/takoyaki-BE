package com.bestbenefits.takoyaki.entity;

import com.bestbenefits.takoyaki.config.properties.oauth.OAuthSocialType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nickname;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private OAuthSocialType social;

    @Column(name = "created_at")
    @Temporal(value = TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;

    @Builder
    public User(String email, OAuthSocialType social){
        this.email = email;
        this.social = social;
        this.createdAt = LocalDateTime.now();
    }

    public void updateNickname(String nickname){
        this.nickname = nickname;
    }

}
