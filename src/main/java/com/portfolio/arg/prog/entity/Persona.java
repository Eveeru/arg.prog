
package com.portfolio.arg.prog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Persona")
public class Persona {
     //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    @Size(min = 1, max = 50, message = "no cumple con la logitud")
    private String nombre;
    
     
    @Size(min = 1, max = 50, message = "no cumple con la logitud")
    private String apellido;
     
    @Lob
    @Size(min = 1, max = 255, message = "no cumple con la logitud")
    private String presentacion;
    
     
    @Size(min = 1, max = 50, message = "no cumple con la logitud")
    private String tituloperfil;
     
      
    @Size(min = 1, max = 50, message = "no cumple con la logitud")
    private String imagen;
    
    @NotBlank
    private String clave;
    
    @Lob
    private String email;
    
    //contructores
    public Persona() {
    }

    public Persona(String nombre, String apellido, String presentacion, String tituloperfil, String imagen, String clave, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.presentacion = presentacion;
        this.tituloperfil = tituloperfil;
        this.imagen = imagen;
        this.clave = clave;
        this.email = email;
    }

   
    
    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getTituloperfil() {
        return tituloperfil;
    }

    public void setTituloperfil(String tituloperfil) {
        this.tituloperfil = tituloperfil;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
