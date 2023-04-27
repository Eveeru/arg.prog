
package com.portfolio.arg.prog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.Size;

@Entity
public class Experiencia {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String trabajo;
    private String puesto;
    @Lob
    @Size(min = 1, max = 255, message = "no cumple con la logitud")
    private String descripcion_exp;
    private String periodo_exp;
    private String img_exp;
    
    //constructores

    public Experiencia() {
    }

    public Experiencia(String trabajo, String puesto, String descripcion_exp, String periodo_exp, String img_exp) {
        this.trabajo = trabajo;
        this.puesto = puesto;
        this.descripcion_exp = descripcion_exp;
        this.periodo_exp = periodo_exp;
        this.img_exp = img_exp;
    }
    
    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion_exp() {
        return descripcion_exp;
    }

    public void setDescripcion_exp(String descripcion_exp) {
        this.descripcion_exp = descripcion_exp;
    }

    public String getPeriodo_exp() {
        return periodo_exp;
    }

    public void setPeriodo_exp(String periodo_exp) {
        this.periodo_exp = periodo_exp;
    }

    public String getImg_exp() {
        return img_exp;
    }

    public void setImg_exp(String img_exp) {
        this.img_exp = img_exp;
    }
    
    
    
    
}
