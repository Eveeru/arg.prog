
package com.portfolio.arg.prog.service;

import com.portfolio.arg.prog.entity.Educacion;
import com.portfolio.arg.prog.repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired REducacion rEducacion;
    
     public List<Educacion> verEducacions() {
        List<Educacion> listaEducacions = rEducacion.findAll();
        return listaEducacions;
    }

    
    public void crearEducacion(Educacion educac) {
       rEducacion.save(educac);
    }
    
    public void editarEducacion(Educacion educac) {
       rEducacion.save(educac);
    }

    public void borrarEducacion(int id) {
        rEducacion.deleteById(id);
    }

   
    public Educacion burscarEducacion(int id) {
        //si no se encuentra la educacion devuelve nulo(null)
        Educacion educac = rEducacion.findById(id).orElse(null);
        return educac;
    }
    
    
}
