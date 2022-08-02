package com.portfolio.nahuelgarrido.Controller;

import com.portfolio.nahuelgarrido.Entity.Contacto;
import com.portfolio.nahuelgarrido.Interface.IContactoService;
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
public class ContactoController {
    @Autowired IContactoService icontactoService;
    
    
    @GetMapping("/contactos/traer")
    public List<Contacto> getContacto(){
        return icontactoService.getContacto();
    }
    
    
    @GetMapping("contactos/traer/{id}")
    public Contacto getContactoId(@PathVariable("id") int id) {
        return icontactoService.findContacto(id);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/contactos/crear")
    public void createContacto(@RequestBody Contacto contacto){
        icontactoService.saveContacto(contacto);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/contactos/borrar/{id}")
    public void deleteContacto(@PathVariable int id){
        icontactoService.deleteContacto(id);
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/contactos/editar/{id}")
    public Contacto editarContacto(@PathVariable("id") int id,
            @RequestBody Contacto contacto) {
        contacto.setId(id);
        icontactoService.saveContacto(contacto);
        return contacto;
    }
    
}