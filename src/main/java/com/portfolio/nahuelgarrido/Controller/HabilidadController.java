package com.portfolio.nahuelgarrido.Controller;

import com.portfolio.nahuelgarrido.Entity.Habilidad;
import com.portfolio.nahuelgarrido.Interface.IHabilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@CrossOrigin(origins = "http://localhost:4200")
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
    
    
    @PostMapping("/habilidades/crear")
    public void createHabilidad(@RequestBody Habilidad habilidad){
        ihabilidadService.saveHabilidad(habilidad);
    }
    
    
    @DeleteMapping("/habilidades/borrar/{id}")
    public void deleteHabilidad(@PathVariable int id){
        ihabilidadService.deleteHabilidad(id);
    }
    
    
    // URL: PUERTO/personas/editar/4/nombre & apellido & img --> 4 es el id
    @PutMapping("/habilidades/editar/{id}")
    public Habilidad editarHabilidad(@PathVariable("id") int id,
            @RequestBody Habilidad habilidad) {
        habilidad.setId(id);
        ihabilidadService.saveHabilidad(habilidad);
        return habilidad;
    }
     

}