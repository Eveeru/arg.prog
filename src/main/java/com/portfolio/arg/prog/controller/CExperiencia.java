
package com.portfolio.arg.prog.controller;


import com.portfolio.arg.prog.entity.Experiencia;
import com.portfolio.arg.prog.service.SExperiencia;
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
@RequestMapping("experiencia")//localhost:8080/experiencia
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    @Autowired
    SExperiencia expeServ;
    
    @GetMapping("/lista")
    @ResponseBody
   public List<Experiencia> verExperiencia(){
        return expeServ.verExperiencia();
    }
   
   //detail
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable int id){
        return expeServ.burscarExperiencia(id);
    }
    
    @PostMapping("/crear")//create
    public String agregarExperiencia(@RequestBody Experiencia Expe){
        expeServ.crearExperiencia(Expe);
        return "La experiencia fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")//delete
    public String eliminarExperiencia(@PathVariable Integer id){
        expeServ.borrarExperiencia(id);
        return"La experiencia fue eliminada correctamente";
    }
    
    @PutMapping("/editar")//edit
    public String editarExperiencia(@RequestBody Experiencia Expe){
        expeServ.editarExperiencia(Expe);
        return"La experiencia se actualizo correctamente";
}
    @PutMapping("/editar/{id}")
    public void editar(@PathVariable ("id") int id, Experiencia Expe){
        expeServ.editarExperiencia(Expe);
    }
    
}
