package com.MinTicCiclo_3.empresatextil.controller;

import com.MinTicCiclo_3.empresatextil.entity.Employee;
import com.MinTicCiclo_3.empresatextil.services.ServicioPrueba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private ServicioPrueba servicioPrueba;
    @GetMapping("/empleado")
    public List<Employee> getEmployeeById() {
        return servicioPrueba.getAllEmployees();
    }

}
