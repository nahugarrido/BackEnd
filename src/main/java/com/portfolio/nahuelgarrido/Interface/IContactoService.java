package com.portfolio.nahuelgarrido.Interface;

import com.portfolio.nahuelgarrido.Entity.Contacto;
import java.util.List;

public interface IContactoService {
    //Traer un contacto
    public List<Contacto> getContacto();
    
    //Guardar un objeto de tipo Contacto
    public void saveContacto(Contacto contacto);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteContacto(int id);
    
    //Buscar un contacto por ID
    public Contacto findContacto(int id);    
}
