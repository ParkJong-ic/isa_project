package com.example.sia.project.main;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import com.vladmihalcea.hibernate.type.array.ListArrayType;

import javax.persistence.*;
import java.awt.*;
import java.util.List;

@Entity
@Getter
@TypeDef(name = "list-array", typeClass = ListArrayType.class)
@NoArgsConstructor
public class AdministrativeArea {

    @Id
    @Column(name = "administrative_area_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long administrativeAreaId;
    @Column(name = "administrative_area_name")
    private String name;

    @Type(type = "list-array", parameters = @org.hibernate.annotations.Parameter(name = "sql_array_type", value = "polygon"))
    @Column(name = "administrative_area_area", columnDefinition = "integer[]")
    private List<Polygon> area;

    public AdministrativeArea(String name, List<Polygon> area) {
        this.name = name;
        this.area = area;
    }

    public AdministrativeArea(Long administrativeAreaId) {
        this.administrativeAreaId = administrativeAreaId;
    }
}
