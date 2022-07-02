package com.portfolio.nahuelgarrido.Interface;

import com.portfolio.nahuelgarrido.Entity.Educacion;
import java.util.List;

public interface IEducacionService {
    //Traer un educacion
    public List<Educacion> getEducacion();
    
    //Guardar un objeto de tipo Educacion
    public void saveEducacion(Educacion educacion);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteEducacion(int id);
    
    //Buscar un educacion por ID
    public Educacion findEducacion(int id);    
}
