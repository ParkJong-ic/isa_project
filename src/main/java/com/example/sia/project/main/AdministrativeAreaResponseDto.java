package com.example.sia.project.main;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AdministrativeAreaResponseDto {
    private Long administrativeAreaId;

    public AdministrativeAreaResponseDto(Long administrativeAreaId) {
        this.administrativeAreaId = administrativeAreaId;
    }
}
