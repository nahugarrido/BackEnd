package com.portfolio.nahuelgarrido.security.entity;

import com.portfolio.nahuelgarrido.security.enums.RolNombre;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Rol {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;
    
    public Rol () {
        
    }
    
    public Rol (@NotNull RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
    
}
