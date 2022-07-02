package com.portfolio.nahuelgarrido.Repository;

import com.portfolio.nahuelgarrido.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository <Proyecto,Integer> {
    
}
