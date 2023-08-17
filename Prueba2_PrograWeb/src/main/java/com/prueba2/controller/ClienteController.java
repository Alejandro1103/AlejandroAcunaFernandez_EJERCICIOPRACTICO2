/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba2.controller;

import com.prueba2.entity.Cliente;
import com.prueba2.entity.Vuelos;
import com.prueba2.service.IClienteService;
import com.prueba2.service.IVuelosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Alejandro
 */
@Controller
public class ClienteController {
    @Autowired
    private IClienteService clienteService;

    @Autowired
    private IVuelosService VuelosService;
    
    @GetMapping("/cliente")// aca definimos el endpoint para el html persona. Se triggerea ese mapping 
    //el restful api ejecuta todo mediante requests.
    public String index(Model model) { //el model permite pasarle al frontend la info mediante el addAttribute
        List<Cliente> listaCliente = clienteService.getAllClientes();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaCliente);
        return "personas";
    }
    
    @GetMapping("/clienteN/")
    public String crearVuelo(Model model) {
        List<Vuelos> listaVuelos = VuelosService;
        model.addAttribute("cliente", new Vuelos());
        model.addAttribute("vuelos", listaVuelos);
        return "crear";

    }
    
    @PostMapping("/save")
    public String guardarCliente(@ModelAttribute Cliente cliente) {
        clienteService.saveCliente(cliente);
        return "redirect:/persona";
    }
}
