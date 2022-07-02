package com.portfolio.nahuelgarrido.Repository;

import com.portfolio.nahuelgarrido.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository <Experiencia,Integer> {
    
}

