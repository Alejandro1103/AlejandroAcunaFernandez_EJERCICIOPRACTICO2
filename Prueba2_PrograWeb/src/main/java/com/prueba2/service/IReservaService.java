/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba2.service;

import com.prueba2.entity.Reservas;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alejandro
 */
@Service

public interface IReservaService {
    public List<Reservas> getAllReservas();
    public Reservas getReservaById (int id);
}
