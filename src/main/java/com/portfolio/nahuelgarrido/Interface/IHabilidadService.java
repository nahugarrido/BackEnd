package com.portfolio.nahuelgarrido.Interface;

import com.portfolio.nahuelgarrido.Entity.Habilidad;
import java.util.List;

public interface IHabilidadService {
    //Traer una persona
    public List<Habilidad> getHabilidad();
    
    //Guardar un objeto de tipo Persona
    public void saveHabilidad(Habilidad habilidad);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteHabilidad(int id);
    
    //Buscar una persona por ID
    public Habilidad findHabilidad(int id);    
}
