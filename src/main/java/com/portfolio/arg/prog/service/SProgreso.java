
package com.portfolio.arg.prog.service;

import com.portfolio.arg.prog.entity.Progreso;
import com.portfolio.arg.prog.repository.RProgreso;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProgreso {
     @Autowired RProgreso rProgreso;
    
     public List<Progreso> verProgresos() {
        List<Progreso> listaProgresos = rProgreso.findAll();
        return listaProgresos;
    }

    
    public void crearProgreso(Progreso prog) {
       rProgreso.save(prog);
    }
    
    public void editarProgreso(Progreso prog) {
       rProgreso.save(prog);
    }

    public void borrarProgreso(int id) {
        rProgreso.deleteById(id);
    }

   
    public Progreso burscarProgreso(int id) {
        //si no se encuentra la progna devuelve nulo(null)
        Progreso prog = rProgreso.findById(id).orElse(null);
        return prog;
    }
    
    
}
