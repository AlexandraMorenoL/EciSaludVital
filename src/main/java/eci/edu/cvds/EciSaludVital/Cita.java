package eci.edu.cvds.EciSaludVital.model;
import java.time.LocalDate;

public class Cita{
    private String nombreCompleto;
    private String cedula;
    private String correo;
    private LocalDate fecha;
    private String especialidad;
    private String doctor;
    private String ubicacion;
    private String estado; //Ya sea confirmada, rechazada, cancelada

}

public String getNombreCompleto(){
    return nombreCompleto;
}

public void setNombreCompleto(String nombreCompleto){
    this.nombreCompleto= nombreCompleto;
}

public String getCedula(){
    return cedula;
}

public void setCedula(String cedula){
    this.cedula= cedula;
}

public String getCorreo(){
    return correo;
}

public void setCorreo(String correo){
    this.correo= correo;
}

public String getFecha(){
    return nombreCompleto;
}

public void setFecha(String fecha){
    this.fecha= fecha;
}

public String getEspecialidad(){
    return especialidad;
}

public void setEspecialidad(String especialidad){
    this.especialidad= especialidad;
}

public String getDoctor(){
    return doctor;
}

public void setDoctor(String doctor){
    this.doctor= doctor;
}

public String getUbicacion(){
    return ubicacion;
}

public void setUbicacion(String ubicacion){
    this.ubicacion= ubicacion;
}
public String getEstado(){
    return estado;
}

public void setEstado(String doctor){
    this.estado= estado;
}

