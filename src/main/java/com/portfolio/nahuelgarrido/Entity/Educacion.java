package com.portfolio.nahuelgarrido.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    

    @Size(min = 0, max = 100, message = "no cumple con la longitud")
    private String titulo;
    

    @Size(min = 0, max = 100, message = "no cumple con la longitud")
    private String institucion;
    

    @Size(min = 0, max = 600, message = "no cumple con la longitud")
    private String descripcion;
    
    @Size(min = 0, max = 100, message = "no cumple con la longitud")    
    private String fecha_inicio;
    
    @Size(min = 0, max = 100, message = "no cumple con la longitud")    
    private String fecha_finalizacion;
    
    private String img;
}