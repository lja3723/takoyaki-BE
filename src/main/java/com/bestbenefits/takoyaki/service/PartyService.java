package com.bestbenefits.takoyaki.service;

import com.bestbenefits.takoyaki.repository.PartyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PartyService {
    private final PartyRepository partyRepository;


}