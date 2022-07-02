package com.portfolio.nahuelgarrido.Interface;

import com.portfolio.nahuelgarrido.Entity.Proyecto;
import java.util.List;

public interface IProyectoService {
    //Traer un proyecto
    public List<Proyecto> getProyecto();
    
    //Guardar un objeto de tipo Proyecto
    public void saveProyecto(Proyecto proyecto);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteProyecto(int id);
    
    //Buscar un proyecto por ID
    public Proyecto findProyecto(int id);    
}
