package br.com.equipment.dto.equipment;

import java.io.Serializable;
import java.time.LocalDateTime;


public class CreateEquipmentDto implements Serializable {

    private String name;

    private String characteristics;

    private Long equipmentType;

    private LocalDateTime register;

    public CreateEquipmentDto() {
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

    public Long getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(Long equipmentType) {
        this.equipmentType = equipmentType;
    }

    public LocalDateTime getRegister() {
        return register;
    }

    public void setRegister(LocalDateTime register) {
        this.register = register;
    }
}
