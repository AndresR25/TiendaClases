/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.service;

import com.Tienda.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author kflex25
 */
@Service
public class UserService implements UserDetailsService{
    
    @Autowired
    public iPersonaService personaService;
    
    @Override
    public UserDetails loadUserByUsername(String apellido1) throws UsernameNotFoundException{
        Persona persona = this.personaService.findByapellido1(apellido1);
        userPrincipal userPrincipal = new userPrincipal(persona);
        return userPrincipal;
        
    }
    
}
