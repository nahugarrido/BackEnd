package com.portfolio.nahuelgarrido.Controller;

import com.portfolio.nahuelgarrido.Entity.Experiencia;
import com.portfolio.nahuelgarrido.Interface.IExperienciaService;
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
@CrossOrigin(origins = "https://frontend-224fb.web.app")
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    
    
    @GetMapping("/experiencias/traer")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    
    
    @GetMapping("experiencias/traer/{id}")
    public Experiencia getExperienciaId(@PathVariable("id") int id) {
        return iexperienciaService.findExperiencia(id);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/experiencias/crear")
    public void createExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/experiencias/borrar/{id}")
    public void deleteExperiencia(@PathVariable int id){
        iexperienciaService.deleteExperiencia(id);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/experiencias/editar/{id}")
    public Experiencia editarExperiencia(@PathVariable("id") int id,
            @RequestBody Experiencia experiencia) {
        experiencia.setId(id);
        iexperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }

}