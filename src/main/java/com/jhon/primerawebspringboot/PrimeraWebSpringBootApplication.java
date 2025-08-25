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
public class PrimeraWebSpringBootApplication  {

    @Autowired
    private PersonaService personaService;

    public static void main(String[] args) {
        SpringApplication.run(PrimeraWebSpringBootApplication.class, args);
    }
}
