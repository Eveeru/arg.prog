
package com.portfolio.arg.prog.repository;

import com.portfolio.arg.prog.entity.Progreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProgreso extends JpaRepository <Progreso, Integer>{
    
}
