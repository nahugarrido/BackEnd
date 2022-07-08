package com.portfolio.nahuelgarrido.Controller;

import com.portfolio.nahuelgarrido.Entity.Educacion;
import com.portfolio.nahuelgarrido.Interface.IEducacionService;
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
public class EducacionController {
    @Autowired IEducacionService ieducacionService;
    
    
    @GetMapping("/educaciones/traer")
    public List<Educacion> getEducacion(){
        return ieducacionService.getEducacion();
    }
    
    @GetMapping("educaciones/traer/{id}")
    public Educacion getEducacionId(@PathVariable("id") int id) {
        return ieducacionService.findEducacion(id);
    }
    
    
    @PostMapping("/educaciones/crear")
    public void createEducacion(@RequestBody Educacion educacion){
        ieducacionService.saveEducacion(educacion);
  
    }
    
    
    @DeleteMapping("/educaciones/borrar/{id}")
    public void deleteEducacion(@PathVariable int id){
        ieducacionService.deleteEducacion(id);
    }
    
    
    // URL: PUERTO/personas/editar/4/nombre & apellido & img --> 4 es el id
    @PutMapping("/educaciones/editar/{id}")
    public Educacion editarEducacion(@PathVariable("id") int id,
            @RequestBody Educacion educacion) {
        educacion.setId(id);
        ieducacionService.saveEducacion(educacion);
        return educacion;
    }
}
