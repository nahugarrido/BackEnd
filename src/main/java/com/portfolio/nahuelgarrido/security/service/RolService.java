package com.portfolio.nahuelgarrido.security.service;
import com.portfolio.nahuelgarrido.security.entity.Rol;
import com.portfolio.nahuelgarrido.security.enums.RolNombre;
import com.portfolio.nahuelgarrido.security.repository.RolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
    
    
    /// no esta lo agrego yo
        public void save(Rol rol){
        rolRepository.save(rol);
    }

}
