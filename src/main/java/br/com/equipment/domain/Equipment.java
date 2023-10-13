package br.com.equipment.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Table(name = "tb_equipment", schema = "equipment")
public class Equipment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "equipment.sq_equipment")
    @SequenceGenerator(name = "equipment.sq_equipment", sequenceName = "equipment.sq_equipment", allocationSize = 1)
    private Long id;

    private String name;

    private String characteristics;

    @Enumerated(EnumType.STRING)
    private StatusEquipment status;

    @JoinColumn(name = "type")
    @ManyToOne(cascade = CascadeType.REFRESH)
    private EquipmentType equipmentType;

    private LocalDateTime register;

    public Equipment() {
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

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public StatusEquipment getStatus() {
        return status;
    }

    public void setStatus(StatusEquipment status) {
        this.status = status;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    public LocalDateTime getRegister() {
        return register;
    }

    public void setRegister(LocalDateTime register) {
        this.register = register;
    }
}
