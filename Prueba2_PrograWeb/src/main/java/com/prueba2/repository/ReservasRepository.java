/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba2.repository;

import com.prueba2.entity.Reservas;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alejandro
 */
@Repository

public interface ReservasRepository extends CrudRepository<Reservas,Long>{
    public List<Reservas> getAllReservas();
    public Reservas getReservaById (int id);  // Encuentra reservas por el id
}
