package com.jhon.primerawebspringboot.service.impl;

import com.jhon.primerawebspringboot.entities.Persona;
import com.jhon.primerawebspringboot.repository.PersonaRepository;
import com.jhon.primerawebspringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> obtenerTodas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona CrearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Long Id, Persona persona) {
        Persona personaBBDD = personaRepository.findById(Id).orElse(null);
        if(personaBBDD != null){
            personaBBDD.setNombre(persona.getNombre());
            personaBBDD.setEdad(persona.getEdad());
            return personaRepository.save(personaBBDD);
        }
        return null;
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public long contarPersonas() {
        return personaRepository.count();
    }
}
