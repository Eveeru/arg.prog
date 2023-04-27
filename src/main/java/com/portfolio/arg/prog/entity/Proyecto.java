
package com.portfolio.arg.prog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.Size;

@Entity
public class Proyecto {
    //atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo_proy;
    private String realizacion;
    @Lob
    @Size(min = 1, max = 255, message = "no cumple con la logitud")
    private String descripcion_proy;
    
    //constructores

    public Proyecto() {
    }

    public Proyecto(String titulo_proy, String realizacion, String descripcion_proy) {
        this.titulo_proy = titulo_proy;
        this.realizacion = realizacion;
        this.descripcion_proy = descripcion_proy;
    }
    
    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo_proy() {
        return titulo_proy;
    }

    public void setTitulo_proy(String titulo_proy) {
        this.titulo_proy = titulo_proy;
    }

    public String getRealizacion() {
        return realizacion;
    }

    public void setRealizacion(String realizacion) {
        this.realizacion = realizacion;
    }

    public String getDescripcion_proy() {
        return descripcion_proy;
    }

    public void setDescripcion_proy(String descripcion_proy) {
        this.descripcion_proy = descripcion_proy;
    }
    
    
}
