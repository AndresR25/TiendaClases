
package com.Tienda.controller;

import com.Tienda.entity.Persona;
import com.Tienda.service.iPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonasController {
    @Autowired
    private iPersonaService personaService;
     
    @GetMapping("/personas")
    public String personas(Model model){
    List<Persona> listaPersonas=personaService.getAllPerson();
    model.addAttribute("titulo","Personas");
    model.addAttribute("personas",listaPersonas);
    return "personas";
    }
}
