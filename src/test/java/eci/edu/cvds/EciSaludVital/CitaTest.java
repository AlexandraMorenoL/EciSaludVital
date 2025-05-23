package eci.edu.cvds.EciSaludVital.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class CitaTest{
    public void crearCitaConDatos(){
        Cita cita = new Cita();
        cita.setNombreCompleto("Alexandra Moreno");
        cita.setCedula("1024656");
        cita.setCorreo("alexandramoreno@eci.edu.co");
        cita.setFecha(LocalDate.now()plusDays(1));
        cita.setEspecialidad("Ortopedia");
        cita.setDoctor("Dra. Gutierrez");
        cita.ubicacion("Consultorio 202");
        cita.setEstado("Confirmada");
    
    assertEquals("Alexandra Moreno", cita.getNombreCompleto());
    assertEquals("Confirmada", cita.getEstado());
    assertTrue(cita.getFecha().isAfter(LocalDate.now(())));
}
public void crearCitaFechaIncorrecta(){
    Cita cita = new Cita();
    cita.setFecha(LocalDate.now().minusDays(2)),

    assertTrue(cita.getFecha().isBefore(LocalDate.now()))
}
}