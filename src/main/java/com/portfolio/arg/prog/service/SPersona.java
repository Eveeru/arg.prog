
package com.portfolio.arg.prog.service;



import com.portfolio.arg.prog.entity.Persona;
import com.portfolio.arg.prog.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class SPersona {
    @Autowired RPersona rPersona;

    public List<Persona> getPersona() {
        List<Persona> persona = rPersona.findAll();
        return persona;
    }

    public void savePersona(Persona persona) {
        rPersona.save(persona);
    }

    public void deletePersona(Integer id) {
        rPersona.deleteById(id);
    }

    public Persona findPersona(Integer id) {
        Persona persona = rPersona.findById(id).orElse(null);
        return persona;
    }
 
}
