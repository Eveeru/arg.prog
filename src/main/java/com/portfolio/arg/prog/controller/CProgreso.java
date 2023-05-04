
package com.portfolio.arg.prog.controller;

import com.portfolio.arg.prog.entity.Progreso;
import com.portfolio.arg.prog.service.SProgreso;
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
@RequestMapping("progreso")//localhost:8080/progreso
@CrossOrigin(origins = "https://frontend-1eeaa.web.app/")
public class CProgreso {
    @Autowired 
    SProgreso progServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Progreso> verProgreso(){
        return progServ.verProgresos();
    }
   
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Progreso verProgreso(@PathVariable int id){
        return progServ.burscarProgreso(id);
    }
    
    @PostMapping("/crear")
    public String agregarProgreso(@RequestBody Progreso prog){
        progServ.crearProgreso(prog);
        return "El progreso fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarProgreso(@PathVariable Integer id){
        progServ.borrarProgreso(id);
        return"El progreso fue eliminada correctamente";
    }
    
    @PutMapping("/editar")
    public String editarProgreso(@RequestBody Progreso prog){
        progServ.editarProgreso(prog);
        return"El progreso se actualizo correctamente";
}
}
