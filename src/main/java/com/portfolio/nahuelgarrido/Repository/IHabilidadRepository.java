package com.portfolio.nahuelgarrido.Repository;

import com.portfolio.nahuelgarrido.Entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadRepository extends JpaRepository<Habilidad,Integer>{
    
}