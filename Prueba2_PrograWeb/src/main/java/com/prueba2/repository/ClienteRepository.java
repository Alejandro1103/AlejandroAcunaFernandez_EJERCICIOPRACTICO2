/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba2.repository;

import com.prueba2.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alejandro
 */
@Repository

public interface ClienteRepository extends CrudRepository<Cliente,Long>{
    public Cliente findByApellido(String apellido); //Encuentra por apellido
    
    public Cliente findByNombre(String nombre); //Encuentra por nombre
    
}
