package com.portfolio.nahuelgarrido.Controller;

import com.portfolio.nahuelgarrido.Entity.Proyecto;
import com.portfolio.nahuelgarrido.Interface.IProyectoService;
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
public class ProyectoController {
    @Autowired IProyectoService iproyectoService;
    
    
    @GetMapping("/proyectos/traer")
    public List<Proyecto> getProyecto(){
        return iproyectoService.getProyecto();
    }
    
    
    @GetMapping("proyectos/traer/{id}")
    public Proyecto getProyectoId(@PathVariable("id") int id) {
        return iproyectoService.findProyecto(id);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/proyectos/crear")
    public void createProyecto(@RequestBody Proyecto proyecto){
        iproyectoService.saveProyecto(proyecto);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/proyectos/borrar/{id}")
    public void deleteProyecto(@PathVariable int id){
        iproyectoService.deleteProyecto(id);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/proyectos/editar/{id}")
    public Proyecto editarProyecto(@PathVariable("id") int id,
            @RequestBody Proyecto proyecto) {
        proyecto.setId(id);
        iproyectoService.saveProyecto(proyecto);
        return proyecto;
    }
    
}