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
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    
    @NotNull
    @Size(min = 1, max = 30, message = "no cumple con la longitud")
    private String nombre;
    @NotNull
    @Size(min = 1, max = 30, message = "no cumple con la longitud")
    private String apellido;
    /// NO LLEVA NULL PORQUE NO QUEREMOS QUE RELLENEN SIN SENTIDO
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String img;
    
    /// AÑADIMOS CAMPOS
    @NotNull
    @Size(min = 1, max = 30, message = "no cumple con la longitud")  
    private String puesto;
    @Size(min = 1, max = 300, message = "no cumple con la longitud") 
    private String descripcion;
    
}
