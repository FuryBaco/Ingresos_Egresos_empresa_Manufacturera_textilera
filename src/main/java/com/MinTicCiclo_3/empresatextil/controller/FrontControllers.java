package com.MinTicCiclo_3.empresatextil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontControllers {



    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/tasks")
    public String tasks(Model model) {
        return "tasks";
    }
}
