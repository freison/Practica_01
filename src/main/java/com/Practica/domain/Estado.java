package com.Practica.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEstado;
    
    private String nombre;
    private String capital;
    private long poblacion;
    
    private boolean poseeCostas;
    
    public Estado() {
    }

    public Estado(long idEstado, String nombre, String capital, long poblacion, boolean poseeCostas) {
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.poseeCostas = poseeCostas;
    }
    
}
