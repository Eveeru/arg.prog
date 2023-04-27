
package com.portfolio.arg.prog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Educacion {
    //atributos
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String periodo_edu;
    private String titulo_edu;
    private String img_edu;
    private String institucion;
    private String nivel;
    
    //constructores

    public Educacion() {
    }

    public Educacion(String periodo_edu, String titulo_edu, String img_edu, String institucion, String nivel) {
        this.periodo_edu = periodo_edu;
        this.titulo_edu = titulo_edu;
        this.img_edu = img_edu;
        this.institucion = institucion;
        this.nivel = nivel;
    }
    
    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPeriodo_edu() {
        return periodo_edu;
    }

    public void setPeriodo_edu(String periodo_edu) {
        this.periodo_edu = periodo_edu;
    }

    public String getTitulo_edu() {
        return titulo_edu;
    }

    public void setTitulo_edu(String titulo_edu) {
        this.titulo_edu = titulo_edu;
    }

    public String getImg_edu() {
        return img_edu;
    }

    public void setImg_edu(String img_edu) {
        this.img_edu = img_edu;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
}
