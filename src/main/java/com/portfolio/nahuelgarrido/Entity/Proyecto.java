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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    

    @Size(min = 0, max = 100, message = "no cumple con la longitud")
    private String nombre;

    @Size(min = 0, max = 100, message = "no cumple con la longitud")    
    private String fecha;
    

    @Size(min = 0, max = 450, message = "no cumple con la longitud")
    private String descripcion;
    

    @Size(min = 0, max = 120, message = "no cumple con la longitud")
    private String livecode_url;
    

    @Size(min = 0, max = 120, message = "no cumple con la longitud")
    private String sourcecode_url;
    

    private String img;

}