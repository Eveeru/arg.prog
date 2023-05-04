
package com.portfolio.arg.prog.controller;


import com.portfolio.arg.prog.entity.Persona;
import com.portfolio.arg.prog.service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("persona")//localhost:8080/persona
@CrossOrigin(origins = "https://frontend-1eeaa.web.app/")
public class CPersona {
    
    @Autowired 
   SPersona sPersona;
    
    //Login
    @PostMapping("/autenticacion/login")
    @ResponseBody 
      public Persona loginPersona(@RequestBody Persona pers){
          return sPersona.loginPersona(pers.getEmail(), pers.getClave());}
            
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<Persona> getPersona(){
        return sPersona.getPersona();
    }
    
    @PostMapping("/crear")
    @ResponseBody 
    public String createPersona(@RequestBody Persona perso){
       sPersona.savePersona(perso);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    @ResponseBody 
    public String deletePersona(@PathVariable Integer id){
        sPersona.deletePersona(id);
        return"La Persona fue eliminada correctamente";
    }
    
    @PutMapping("/editar/{id}")
    @ResponseBody 
    public Persona editPersona(@PathVariable Integer id,
                   @RequestParam("nombre") String nuevoNombre,
                   @RequestParam("apellido") String nuevoApellido,
                   @RequestParam("presentacion") String nuevaPresentacion,
                   @RequestParam("tituloperfil") String nuevoTituloperfil,
                   @RequestParam("imagen") String nuevaImagen){
        Persona persona = sPersona.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setPresentacion(nuevaPresentacion);
        persona.setTituloperfil(nuevoTituloperfil);
        persona.setImagen(nuevaImagen);
        
        
        sPersona.savePersona(persona);
        return persona;
}
    
}
