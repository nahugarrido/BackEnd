package com.portfolio.nahuelgarrido.Service;

import com.portfolio.nahuelgarrido.Entity.Proyecto;
import com.portfolio.nahuelgarrido.Interface.IProyectoService;
import com.portfolio.nahuelgarrido.Repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectoService implements IProyectoService {
    @Autowired IProyectoRepository iproyectoRepository ;
    
    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyecto = iproyectoRepository.findAll();
        return proyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        iproyectoRepository.save(proyecto);
    }

    @Override
    public void deleteProyecto(int id) {
        iproyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(int id) {
        Proyecto proyecto = iproyectoRepository.findById(id).orElse(null);
        return proyecto;
    }
    
}