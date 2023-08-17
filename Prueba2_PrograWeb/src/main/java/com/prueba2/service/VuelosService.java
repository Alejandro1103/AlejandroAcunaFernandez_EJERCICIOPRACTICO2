/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba2.service;

import com.prueba2.entity.Vuelos;
import com.prueba2.repository.VuelosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alejandro
 */
//el implements implementa todos los metodos de la clase que estamos llamando

@Service
public class VuelosService implements IVuelosService{
    
    @Autowired    // Es para unir ambos objetos/instancias. Ese autowired crea el puente entre el Repository y el Service
    private VuelosRepository vuelosRepository;

    @Override
    public List<Vuelos> getAllVuelos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Vuelos getVueloById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
