
package com.portfolio.arg.prog.repository;

import com.portfolio.arg.prog.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona, Integer>{
    public List<Persona> findByEmailAndClave(String email, String clave);
    
}
