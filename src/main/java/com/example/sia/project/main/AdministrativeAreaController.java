package com.example.sia.project.main;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AdministrativeAreaController {

    private final AdministrativeAreaService administrativeAreaService;

    @PostMapping("/regions")
    public AdministrativeAreaResponseDto createAdministrativeArea(@RequestBody AdministrativeAreaRequestDto administrativeAreaRequestDto) {
        return administrativeAreaService.createAdministrativeArea(administrativeAreaRequestDto);
    }
}
