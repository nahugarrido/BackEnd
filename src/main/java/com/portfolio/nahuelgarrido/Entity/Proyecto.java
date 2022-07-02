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
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 20, message = "no cumple con la longitud")    
    private String fecha;
    
    @NotNull
    @Size(min = 1, max = 300, message = "no cumple con la longitud")
    private String descripcion;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String livecode_url;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String sourcecode_url;
    
    @Size(min = 0, max = 100, message = "no cumple con la longitud")
    private String img;

}
