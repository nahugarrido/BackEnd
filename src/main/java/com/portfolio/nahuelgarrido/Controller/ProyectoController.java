package com.portfolio.nahuelgarrido.Controller;

import com.portfolio.nahuelgarrido.Entity.Proyecto;
import com.portfolio.nahuelgarrido.Interface.IProyectoService;
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
public class ProyectoController {
    @Autowired IProyectoService iproyectoService;
    
    
    @GetMapping("/proyectos/traer")
    public List<Proyecto> getProyecto(){
        return iproyectoService.getProyecto();
    }
    
    
    @PostMapping("/proyectos/crear")
    public String createProyecto(@RequestBody Proyecto proyecto){
        iproyectoService.saveProyecto(proyecto);
        return "El proyecto fue creado correctamente";
    }
    
    
    @DeleteMapping("/proyectos/borrar/{id}")
    public String deleteProyecto(@PathVariable int id){
        iproyectoService.deleteProyecto(id);
        return "El proyecto fue eliminado correctamente";
    }
    
    
    // URL: PUERTO/personas/editar/4/nombre & apellido & img --> 4 es el id
    @PutMapping("/proyectos/editar/{id}")
    public Proyecto editProyecto(@PathVariable int id,
            @RequestParam("nombre") String nuevo_nombre,
            @RequestParam("fecha") String nuevo_fecha,
            @RequestParam("descripcion") String nuevo_descripcion,
            @RequestParam("livecode_url") String nuevo_livecode_url,
            @RequestParam("sourcecode_url") String nuevo_sourcecode_url,
            @RequestParam("img") String nuevo_img){
        
        Proyecto proyecto = iproyectoService.findProyecto(id);
        proyecto.setNombre(nuevo_nombre);
        proyecto.setFecha(nuevo_fecha);
        proyecto.setDescripcion(nuevo_descripcion);
        proyecto.setLivecode_url(nuevo_livecode_url);
        proyecto.setSourcecode_url(nuevo_sourcecode_url);
        proyecto.setImg(nuevo_img);
        
        iproyectoService.saveProyecto(proyecto);
        return proyecto;
    }
    
    @GetMapping("/proyectos/traer/proyecto2")
    public Proyecto findProyecto(){
        return iproyectoService.findProyecto((int)1);
    }
    
    @GetMapping(path = {"/proyectos/{id}"})
    public Proyecto findProyecto(@PathVariable("id")int id){         
        return iproyectoService.findProyecto(id);
    }

}