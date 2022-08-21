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
    
    @NotNull
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String titulo;
    
    @NotNull
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String institucion;
    
    @NotNull
    @Size(min = 1, max = 600, message = "no cumple con la longitud")
    private String descripcion;
    
    @Size(min = 1, max = 100, message = "no cumple con la longitud")    
    private String fecha_inicio;
    
    @Size(min = 1, max = 100, message = "no cumple con la longitud")    
    private String fecha_finalizacion;
    
    private String img;
}