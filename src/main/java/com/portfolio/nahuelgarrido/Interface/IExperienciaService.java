package com.portfolio.nahuelgarrido.Interface;

import com.portfolio.nahuelgarrido.Entity.Experiencia;
import java.util.List;

public interface IExperienciaService {
    //Traer un experiencia
    public List<Experiencia> getExperiencia();
    
    //Guardar un objeto de tipo Experiencia
    public void saveExperiencia(Experiencia experiencia);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteExperiencia(int id);
    
    //Buscar un experiencia por ID
    public Experiencia findExperiencia(int id);    
}