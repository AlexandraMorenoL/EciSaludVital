package eci.edu.cvds.EciSaludVital.model;
import java.time.LocalDate;

public class Cita{
    private String id;
    private String nombreCompleto;
    private String cedula;
    private String correo;
    private LocalDate fecha;
    private String especialidad;
    private String doctor;
    private String ubicacion;
    private String estado; //Ya sea confirmada, rechazada, cancelada

}

public class Cita() {}