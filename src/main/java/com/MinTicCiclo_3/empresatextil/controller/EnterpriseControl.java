package com.MinTicCiclo_3.empresatextil.controller;

import com.MinTicCiclo_3.empresatextil.entity.Enterprise;
import com.MinTicCiclo_3.empresatextil.services.EnterpriseServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnterpriseControl {
    @Autowired
    private EnterpriseServ enterpriseServ;

    @GetMapping("/enterprise")
    public List<Enterprise> getEnterpriseById() {

        return enterpriseServ.getAllEnterprises();
    }

    @PostMapping("/enterprise")
    public Enterprise createEnterprise(@RequestBody Enterprise enterprise) {
        return enterpriseServ.createEnterprise(enterprise);
    }

}
