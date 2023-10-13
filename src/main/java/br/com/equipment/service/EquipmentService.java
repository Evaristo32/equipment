package br.com.equipment.service;

import br.com.equipment.dto.equipment.CreateEquipmentDto;

public interface EquipmentService {

    Long create(CreateEquipmentDto createEquipmentDto);
}
