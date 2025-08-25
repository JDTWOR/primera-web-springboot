package com.jhon.primerawebspringboot.controller;


import com.jhon.primerawebspringboot.entities.Persona;
import com.jhon.primerawebspringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    // La clase Model se utiliza para tranferir objetos del controller a la vista
    @GetMapping
    public String listarPersonas(Model model){
        List<Persona> personas = personaService.obtenerTodas();
        model.addAttribute("personasLista", personas);
        return "listar";
    }

    public String mostrarFormularioDeNuevaPersona(Model model){
        return "crear";
    }
}
