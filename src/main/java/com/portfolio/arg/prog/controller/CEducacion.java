
package com.portfolio.arg.prog.controller;

import com.portfolio.arg.prog.entity.Educacion;
import com.portfolio.arg.prog.service.SEducacion;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("educacion")//localhost:8080/educacion
@CrossOrigin(origins = "https://frontend-1eeaa.web.app/")
public class CEducacion {
    @Autowired 
    SEducacion eduServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduServ.verEducacions();
    }
   
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Educacion verEducacion(@PathVariable int id){
        return eduServ.burscarEducacion(id);
    }
    
    @PostMapping("/crear")
    public String agregarEducacion(@RequestBody Educacion educac){
        eduServ.crearEducacion(educac);
        return "La educacion fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarEducacion(@PathVariable Integer id){
        eduServ.borrarEducacion(id);
        return"La educacion fue eliminada correctamente";
    }
    
    @PutMapping("/editar")
    public String editarEducacion(@RequestBody Educacion educac){
        eduServ.editarEducacion(educac);
        return"La educacion se actualizo correctamente";
}
}
