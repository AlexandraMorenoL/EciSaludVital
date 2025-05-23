package eci.edu.cvds.EciSaludVital.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Especialidad {
    private String nombre;
    private String descricion;
    private String imagen;
    private String doctor;
    private String ubicacion;
}

public Especialidad() {}
public Especialidad(String nombre, String descricion, String imagen, String doctor, String ubicacion){
    this.nombre=nombre;
    this.descricion=descricion;
    this.imagen=imagen;
    this.doctor=doctor;
    this.ubicacion=ubicacion
}
public String getNombre(){
    return nombre;
}

public




























 