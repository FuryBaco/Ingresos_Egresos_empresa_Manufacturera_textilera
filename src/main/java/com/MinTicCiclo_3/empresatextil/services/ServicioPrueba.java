package com.MinTicCiclo_3.empresatextil.services;

import com.MinTicCiclo_3.empresatextil.entity.Employee;
import com.MinTicCiclo_3.empresatextil.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioPrueba {
    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {

        return (List<Employee>) this.employeeRepo.findAll();
    }

    public Employee getEmployeeById(Long idEmployee) {

        Optional<Employee> opcional =  this.employeeRepo.findById(idEmployee);
        if (opcional.isEmpty() ) {
            return null;
        }
        return opcional.get();
    }
}
