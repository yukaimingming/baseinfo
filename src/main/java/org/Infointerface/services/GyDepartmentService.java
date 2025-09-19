package org.Infointerface.services;

import org.Infointerface.entity.GyDepartment;
import org.Infointerface.entity.GyDepartmentDto;
import org.Infointerface.repository.GyDepartmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GyDepartmentService implements IGydepartmentService {

    @Autowired
    private GyDepartmentRepository departmentRepository;

    @Override
    public GyDepartmentDto getDepartmentDtoById(String departmentId) {
        GyDepartment department = departmentRepository.findById(departmentId).orElse(null);
        if (department == null) {
            return null;
        }
        GyDepartmentDto dto = new GyDepartmentDto();
        BeanUtils.copyProperties(department, dto);
        return dto;
    }
}
