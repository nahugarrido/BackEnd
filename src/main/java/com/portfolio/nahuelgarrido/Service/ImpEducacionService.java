package com.portfolio.nahuelgarrido.Service;

import com.portfolio.nahuelgarrido.Entity.Educacion;
import com.portfolio.nahuelgarrido.Interface.IEducacionService;
import com.portfolio.nahuelgarrido.Repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEducacionService implements IEducacionService {
    @Autowired IEducacionRepository ieducacionRepository ;
    
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion = ieducacionRepository.findAll();
        return educacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        ieducacionRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(int id) {
        ieducacionRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(int id) {
        Educacion educacion = ieducacionRepository.findById(id).orElse(null);
        return educacion;
    }
    
}
