
package com.portfolio.arg.prog.controller;

import com.portfolio.arg.prog.entity.Proyecto;
import com.portfolio.arg.prog.service.SProyecto;
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
@RequestMapping("proyecto")//localhost:8080/proyecto
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {
    @Autowired 
    SProyecto proyServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Proyecto> verProyecto(){
        return proyServ.verProyectos();
    }
   
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id){
        return proyServ.burscarProyecto(id);
    }
    
    @PostMapping("/crear")
    public String agregarProyecto(@RequestBody Proyecto proy){
        proyServ.crearProyecto(proy);
        return "El proyecto fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarProyecto(@PathVariable Integer id){
        proyServ.borrarProyecto(id);
        return"El proyecto fue eliminada correctamente";
    }
    
    @PutMapping("/editar")
    public String editarProyecto(@RequestBody Proyecto proy){
        proyServ.editarProyecto(proy);
        return"El proyecto se actualizo correctamente";
}
}
