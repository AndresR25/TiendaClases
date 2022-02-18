
package com.Tienda.controller;

import com.Tienda.service.iPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
    @Autowired
    private iPersonaService personaService;
    
    @GetMapping({"/","/perro"})
    public String index(){
        return "login";
    }
}
