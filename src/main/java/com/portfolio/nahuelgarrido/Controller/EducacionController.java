package com.portfolio.nahuelgarrido.Controller;

import com.portfolio.nahuelgarrido.Entity.Educacion;
import com.portfolio.nahuelgarrido.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducacionController {
    @Autowired IEducacionService ieducacionService;
    
    
    @GetMapping("/educaciones/traer")
    public List<Educacion> getEducacion(){
        return ieducacionService.getEducacion();
    }
    
    
    @PostMapping("/educaciones/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        ieducacionService.saveEducacion(educacion);
        return "El educacion fue creado correctamente";
    }
    
    
    @DeleteMapping("/educaciones/borrar/{id}")
    public String deleteEducacion(@PathVariable int id){
        ieducacionService.deleteEducacion(id);
        return "El educacion fue eliminado correctamente";
    }
    
    
    // URL: PUERTO/personas/editar/4/nombre & apellido & img --> 4 es el id
    @PutMapping("/educaciones/editar/{id}")
    public Educacion editEducacion(@PathVariable int id,
            @RequestParam("titulo") String nuevo_titulo,
            @RequestParam("descripcion") String nuevo_descripcion,
            @RequestParam("fecha_inicio") String nuevo_fecha_inicio,
            @RequestParam("fecha_finalizacion") String nuevo_fecha_finalizacion,
            @RequestParam("imagen") String nuevo_img){
        
        Educacion educacion = ieducacionService.findEducacion(id);
        educacion.setTitulo(nuevo_titulo);
        educacion.setDescripcion(nuevo_descripcion);
        educacion.setFecha_inicio(nuevo_fecha_inicio);
        educacion.setFecha_finalizacion(nuevo_fecha_finalizacion);
        educacion.setImg(nuevo_img);
        
        ieducacionService.saveEducacion(educacion);
        return educacion;
    }

}
