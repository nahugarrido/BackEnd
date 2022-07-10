package com.portfolio.nahuelgarrido.Controller;

import com.portfolio.nahuelgarrido.Entity.Experiencia;
import com.portfolio.nahuelgarrido.Interface.IExperienciaService;
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
    
    
    @PostMapping("/experiencias/crear")
    public void createExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
    }
    
    
    @DeleteMapping("/experiencias/borrar/{id}")
    public void deleteExperiencia(@PathVariable int id){
        iexperienciaService.deleteExperiencia(id);
    }
    
    @PutMapping("/experiencias/editar/{id}")
    public Experiencia editarExperiencia(@PathVariable("id") int id,
            @RequestBody Experiencia experiencia) {
        experiencia.setId(id);
        iexperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }
    
    
    
    
    
    // URL: PUERTO/personas/editar/4/nombre & apellido & img --> 4 es el id

//    @PutMapping("/experiencias/editar/{id}")
//    public Experiencia editExperiencia(@PathVariable int id,
//            @RequestBody() String nuevo_empresa,
//            @RequestBody() String nuevo_puesto,
//            @RequestBody() String nuevo_descripcion,
//            @RequestBody() String nuevo_fecha_inicio,
//            @RequestBody() String nuevo_fecha_finalizacion,
//            @RequestBody() String nuevo_img){
//        
//        Experiencia experiencia = iexperienciaService.findExperiencia(id);
//        experiencia.setEmpresa(nuevo_empresa);
//        experiencia.setDescripcion(nuevo_descripcion);
//        experiencia.setFecha_inicio(nuevo_fecha_inicio);
//        experiencia.setFecha_finalizacion(nuevo_fecha_finalizacion);
//        experiencia.setImg(nuevo_img);
//       
//        iexperienciaService.saveExperiencia(experiencia);
//        return experiencia;
//    }
    

}