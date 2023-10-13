package br.com.equipment.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_equipment_type", schema = "equipment")
public class EquipmentType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "equipment.sq_equipment_type")
    @SequenceGenerator(name = "equipment.sq_equipment_type", sequenceName = "equipment.sq_equipment_type", allocationSize = 1)
    private Long id;

    private String name;

    private String description;

    public EquipmentType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
