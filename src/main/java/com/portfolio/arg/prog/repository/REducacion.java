
package com.portfolio.arg.prog.repository;

import com.portfolio.arg.prog.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository <Educacion, Integer>{
    
}
