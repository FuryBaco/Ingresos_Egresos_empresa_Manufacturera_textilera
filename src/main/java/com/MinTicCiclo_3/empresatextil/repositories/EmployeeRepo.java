package com.MinTicCiclo_3.empresatextil.repositories;

import com.MinTicCiclo_3.empresatextil.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}
