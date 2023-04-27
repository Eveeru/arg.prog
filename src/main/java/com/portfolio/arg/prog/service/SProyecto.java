
package com.portfolio.arg.prog.service;

import com.portfolio.arg.prog.entity.Proyecto;
import com.portfolio.arg.prog.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired RProyecto rProyecto;
    
     public List<Proyecto> verProyectos() {
        List<Proyecto> listaProyectos = rProyecto.findAll();
        return listaProyectos;
    }

    
    public void crearProyecto(Proyecto proy) {
       rProyecto.save(proy);
    }
    
    public void editarProyecto(Proyecto proy) {
       rProyecto.save(proy);
    }

    public void borrarProyecto(int id) {
        rProyecto.deleteById(id);
    }

   
    public Proyecto burscarProyecto(int id) {
        //si no se encuentra la proyna devuelve nulo(null)
        Proyecto proy = rProyecto.findById(id).orElse(null);
        return proy;
    }
}
