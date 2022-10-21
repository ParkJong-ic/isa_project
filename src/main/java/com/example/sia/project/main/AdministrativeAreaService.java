package com.example.sia.project.main;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AdministrativeAreaService {
    private final AdministrativeAreaRepository administrativeAreaRepository;

    @Transactional
    public AdministrativeAreaResponseDto createAdministrativeArea(AdministrativeAreaRequestDto administrativeAreaRequestDto) {
        AdministrativeArea administrativeArea = new AdministrativeArea(administrativeAreaRequestDto.getName(), administrativeAreaRequestDto.getArea());
        administrativeAreaRepository.save(administrativeArea);
        return new AdministrativeAreaResponseDto(administrativeArea.getAdministrativeAreaId());
    }
}
