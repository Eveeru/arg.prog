
package com.portfolio.arg.prog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Progreso {
    //atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre_prog;
    private String porcentaje;
    
    //constructores

    public Progreso() {
    }

    public Progreso(String nombre_prog, String porcentaje) {
        this.nombre_prog = nombre_prog;
        this.porcentaje = porcentaje;
    }
    
    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_prog() {
        return nombre_prog;
    }

    public void setNombre_prog(String nombre_prog) {
        this.nombre_prog = nombre_prog;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
