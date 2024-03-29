package com.portfolio.nahuelgarrido.Repository;

import com.portfolio.nahuelgarrido.Entity.Educacion;
import com.portfolio.nahuelgarrido.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository <Educacion,Integer> {

    public Persona save(Persona persona);
    
}

