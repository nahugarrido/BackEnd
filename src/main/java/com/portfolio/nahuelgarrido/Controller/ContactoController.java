package com.portfolio.nahuelgarrido.Controller;

import com.portfolio.nahuelgarrido.Entity.Contacto;
import com.portfolio.nahuelgarrido.Interface.IContactoService;
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
public class ContactoController {
    @Autowired IContactoService icontactoService;
    
    
    @GetMapping("/contactos/traer")
    public List<Contacto> getContacto(){
        return icontactoService.getContacto();
    }
    
    
    @PostMapping("/contactos/crear")
    public String createContacto(@RequestBody Contacto contacto){
        icontactoService.saveContacto(contacto);
        return "El contacto fue creado correctamente";
    }
    
    
    @DeleteMapping("/contactos/borrar/{id}")
    public String deleteContacto(@PathVariable int id){
        icontactoService.deleteContacto(id);
        return "El contacto fue eliminado correctamente";
    }
    
    
    // URL: PUERTO/personas/editar/4/nombre & apellido & img --> 4 es el id
    @PutMapping("/contactos/editar/{id}")
    public Contacto editContacto(@PathVariable int id,
            @RequestParam("mail") String nuevo_mail_contacto,
            @RequestParam("github") String nuevo_github_url,
            @RequestParam("linkedin") String nuevo_linkedin_url){
        
        Contacto contacto = icontactoService.findContacto(id);
        contacto.setMail_contacto(nuevo_mail_contacto);
        contacto.setGithub_url(nuevo_github_url);
        contacto.setLinkedin_url(nuevo_linkedin_url);
        
        icontactoService.saveContacto(contacto);
        return contacto;
    }

}