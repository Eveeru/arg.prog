
package com.portfolio.arg.prog.repository;

import com.portfolio.arg.prog.entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository <Experiencia, Integer>{
    public Optional<Experiencia> findByTrabajo(String trabajo);
    public boolean existsByTrabajo(String trabajo);
}
