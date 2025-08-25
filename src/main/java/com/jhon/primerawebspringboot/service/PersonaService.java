package com.jhon.primerawebspringboot.service;

import com.jhon.primerawebspringboot.entities.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> obtenerTodas();
    Persona obtenerPorId(Long id);
    Persona CrearPersona(Persona persona);
    Persona actualizarPersona(Long Id, Persona persona);
    void eliminarPersona(Long id);
    long contarPersonas();
}
