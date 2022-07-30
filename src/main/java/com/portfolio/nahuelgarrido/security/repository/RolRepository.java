package com.portfolio.nahuelgarrido.security.repository;

import com.portfolio.nahuelgarrido.security.entity.Rol;
import com.portfolio.nahuelgarrido.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
