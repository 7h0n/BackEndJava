package com.ejemplo.SpringBoot.model.repository;

import com.ejemplo.SpringBoot.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Personarepository extends JpaRepository <Persona,Long>{
    
}
