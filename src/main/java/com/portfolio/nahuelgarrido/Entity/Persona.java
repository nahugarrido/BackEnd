package com.portfolio.nahuelgarrido.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Size(min = 1, max = 80, message = "no cumple con la longitud")
    private String nombre;
    

    @Size(min = 1, max = 80, message = "no cumple con la longitud")
    private String apellido;
    

    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String puesto;
    
    @Size(min = 1, max = 800, message = "no cumple con la longitud")
    private String descripcion;

    // Las imagenes no deben tener size o limitaria el tamaño de las imagenes que pueden ser aceptadas
    private String img;
    private String img_banner;
}