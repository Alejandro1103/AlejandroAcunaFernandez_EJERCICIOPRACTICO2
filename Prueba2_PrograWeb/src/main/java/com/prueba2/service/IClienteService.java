/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba2.service;
import com.prueba2.entity.Cliente;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alejandro
 */
@Service

public interface IClienteService {
    public List<Cliente> getAllCliente();
    public Cliente getClienteById (int id);
    public Cliente findByApellido(String apellido); //findbyapellido
    public void saveCliente(Cliente cliente);
    public void delete (int id);
    public Cliente findByNombre(String username);

    public List<Cliente> getAllClientes();
}
