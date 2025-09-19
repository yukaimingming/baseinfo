package org.Infointerface.repository;

import org.Infointerface.entity.GyDepartment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GyDepartmentRepository extends CrudRepository<GyDepartment, String> {
}
