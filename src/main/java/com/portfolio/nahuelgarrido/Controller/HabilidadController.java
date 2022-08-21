package com.portfolio.nahuelgarrido.Controller;

import com.portfolio.nahuelgarrido.Entity.Habilidad;
import com.portfolio.nahuelgarrido.Interface.IHabilidadService;
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
public class HabilidadController {
    @Autowired IHabilidadService ihabilidadService;
    
    
    @GetMapping("/habilidades/traer")
    public List<Habilidad> getHabilidad(){
        return ihabilidadService.getHabilidad();
    }
    
    
    @GetMapping("habilidades/traer/{id}")
    public Habilidad getHabilidadId(@PathVariable("id") int id) {
        return ihabilidadService.findHabilidad(id);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/habilidades/crear")
    public void createHabilidad(@RequestBody Habilidad habilidad){
        ihabilidadService.saveHabilidad(habilidad);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/habilidades/borrar/{id}")
    public void deleteHabilidad(@PathVariable int id){
        ihabilidadService.deleteHabilidad(id);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/habilidades/editar/{id}")
    public Habilidad editarHabilidad(@PathVariable("id") int id,
            @RequestBody Habilidad habilidad) {
        habilidad.setId(id);
        ihabilidadService.saveHabilidad(habilidad);
        return habilidad;
    }
    
}