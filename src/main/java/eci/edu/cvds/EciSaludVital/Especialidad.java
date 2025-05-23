package eci.edu.cvds.EciSaludVital.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Representa una especialidad médica almacenada en MongoDB.
 */
@Document(collection = "especialidades")
public class Especialidad {

    @Id
    private String id;

    private String nombre;
    private String descripcion;
    private String imagen;
    private String doctor;
    private String ubicacion;

    // Constructores
    public Especialidad() {}

    public Especialidad(String nombre, String descripcion, String imagen, String doctor, String ubicacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.doctor = doctor;
        this.ubicacion = ubicacion;
    }

    // Getters y setters

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
