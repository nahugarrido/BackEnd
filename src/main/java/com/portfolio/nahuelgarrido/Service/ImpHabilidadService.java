package com.portfolio.nahuelgarrido.Service;

import com.portfolio.nahuelgarrido.Entity.Habilidad;
import com.portfolio.nahuelgarrido.Interface.IHabilidadService;
import com.portfolio.nahuelgarrido.Repository.IHabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpHabilidadService implements IHabilidadService{
    @Autowired IHabilidadRepository ihabilidadRepository;
    
    @Override
    public List<Habilidad> getHabilidad() {
        List<Habilidad> habilidad = ihabilidadRepository.findAll();
        return habilidad;
    }

    @Override
    public void saveHabilidad(Habilidad habilidad) {
        ihabilidadRepository.save(habilidad);
    }

    @Override
    public void deleteHabilidad(int id) {
        ihabilidadRepository.deleteById(id);
    }

    @Override
    public Habilidad findHabilidad(int id) {
         Habilidad habilidad = ihabilidadRepository.findById(id).orElse(null);
         return habilidad;
    }
    
}
