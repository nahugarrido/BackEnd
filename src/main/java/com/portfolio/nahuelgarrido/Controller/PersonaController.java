package com.portfolio.nahuelgarrido.Controller;

import com.portfolio.nahuelgarrido.Entity.Persona;
import com.portfolio.nahuelgarrido.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    
    @GetMapping("/personas/traer/{id}")
    public Persona getPersonaId(@PathVariable("id") long id) {
        return ipersonaService.findPersona(id);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public void createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}")
    public void deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
    }
    
    
    // URL: PUERTO/personas/editar/4/nombre & apellido & img --> 4 es el id
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public Persona editarPersona(@PathVariable("id") long id,
            @RequestBody Persona persona) {
        persona.setId(id);
        ipersonaService.savePersona(persona);
        return persona;
    }
    
}