/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.repository;

import com.Tienda.entity.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author kflex25
 */
public interface PersonaRepository extends CrudRepository<Persona,Long>{
    
}
