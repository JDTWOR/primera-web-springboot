package com.jhon.primerawebspringboot.repository;

import com.jhon.primerawebspringboot.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Estereotipos
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
