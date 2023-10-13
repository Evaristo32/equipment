package br.com.equipment.service.impl;

import br.com.equipment.domain.Equipment;
import br.com.equipment.domain.EquipmentType;
import br.com.equipment.domain.StatusEquipment;
import br.com.equipment.dto.equipment.CreateEquipmentDto;
import br.com.equipment.repository.EquipmentRepository;
import br.com.equipment.service.EquipmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    private final EquipmentRepository repository;

    public EquipmentServiceImpl(EquipmentRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @Override
    public Long create(CreateEquipmentDto createEquipmentDto) {

        Equipment equipment = new Equipment();
        equipment.setName(createEquipmentDto.getName());
        equipment.setCharacteristics(createEquipmentDto.getCharacteristics());

        EquipmentType equipmentType = new EquipmentType();
        equipmentType.setId(createEquipmentDto.getEquipmentType());

        equipment.setEquipmentType(equipmentType);
        equipment.setRegister(LocalDateTime.now());
        equipment.setStatus(StatusEquipment.ACTIVE);
        return repository.save(equipment).getId();
    }
}
