
package com.portfolio.arg.prog.service;

import com.portfolio.arg.prog.entity.Experiencia;
import com.portfolio.arg.prog.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    
    public List<Experiencia> verExperiencia(){
         List<Experiencia> listaExperiencias = rExperiencia.findAll();
         return listaExperiencias;
    }
    
    public void crearExperiencia(Experiencia expe){
        rExperiencia.save(expe);
    }
    
     public void editarExperiencia(Experiencia expe){
        rExperiencia.save(expe);
    }
    
    public void borrarExperiencia(int id){
        rExperiencia.deleteById(id);
    }
    
    public Experiencia burscarExperiencia(int id) {
        //si no se encuentra la persona devuelve nulo(null)
        Experiencia expe = rExperiencia.findById(id).orElse(null);
        return expe;
    }
    
    public boolean existsById(int id){
        return rExperiencia.existsById(id);
    }
    
    public boolean existsByTrabajo(String trabajo){
        return rExperiencia.existsByTrabajo(trabajo);
    }
}
