package com.bestbenefits.takoyaki.repository;

import com.bestbenefits.takoyaki.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PartyRepository extends JpaRepository<Party, Long> {
}
