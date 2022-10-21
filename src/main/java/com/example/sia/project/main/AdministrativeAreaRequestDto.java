package com.example.sia.project.main;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.List;

@Getter
@NoArgsConstructor
public class AdministrativeAreaRequestDto {
    private String name;
    private List<Polygon> area;

    public AdministrativeAreaRequestDto(String name, List<Polygon> area) {
        this.name = name;
        this.area = area;
    }
}
