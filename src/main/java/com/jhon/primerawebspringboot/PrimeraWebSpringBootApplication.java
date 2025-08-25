package com.jhon.primerawebspringboot;

import com.jhon.primerawebspringboot.entities.Persona;
import com.jhon.primerawebspringboot.repository.PersonaRepository;
import com.jhon.primerawebspringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringBootApplication implements CommandLineRunner {

    @Autowired
    private PersonaService personaService;

    public static void main(String[] args) {
        SpringApplication.run(PrimeraWebSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        personaService.CrearPersona(new Persona(5L, "Sofia", 20));
        personaService.CrearPersona(new Persona(6L, "Andres", 17));
        personaService.CrearPersona(new Persona(7L, "Stiven", 19));
        personaService.CrearPersona(new Persona(8L, "Santander", 23));

        // Mostramos el numero de personas
        System.out.println("Numero de personas de la tabla: " + personaService.contarPersonas());

        // Monstramos la lista de personas
        List<Persona> personas = personaService.obtenerTodas();
        personas.forEach(p -> System.out.println("Nombre de la persona: " + p.getNombre()));
    }
}
