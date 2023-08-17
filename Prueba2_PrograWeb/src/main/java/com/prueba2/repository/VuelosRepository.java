/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba2.repository;

import com.prueba2.entity.Vuelos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alejandro
 */
@Repository

public interface VuelosRepository extends CrudRepository<Vuelos,Long>{
    public List<Vuelos> getAllVuelos();
    public Vuelos getVueloById (int id); // Encuentra los vuelos por id
}
