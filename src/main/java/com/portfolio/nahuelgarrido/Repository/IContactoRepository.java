package com.portfolio.nahuelgarrido.Repository;

import com.portfolio.nahuelgarrido.Entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactoRepository extends JpaRepository<Contacto,Integer>{
    
}
