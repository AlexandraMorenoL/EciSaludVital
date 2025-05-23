package eci.edu.cvds.EciSaludVital;

import eci.edu.cvds.EciSaludVital.model.Cita;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class CitaTest {

    @Test
    public void deberiaAsignarNombreCompletoCorrectamente() {
        Cita cita = new Cita();
        cita.setNombreCompleto("Juan Pérez");
        assertEquals("Juan Pérez", cita.getNombreCompleto());
    }

    @Test
    public void deberiaAsignarFechaCorrectamente() {
        Cita cita = new Cita();
        LocalDate fecha = LocalDate.of(2025, 5, 23);
        cita.setFecha(fecha);
        assertEquals(fecha, cita.getFecha());
    }

    @Test
    public void deberiaCrearCitaCompletaConDatosValidos() {
        Cita cita = new Cita();
        LocalDate fecha = LocalDate.of(2025, 5, 23);

        cita.setNombreCompleto("María López");
        cita.setCedula("123456789");
        cita.setCorreo("maria@eci.edu.co");
        cita.setFecha(fecha);
        cita.setEspecialidad("Cardiología");
        cita.setDoctor("Dr. Gómez");
        cita.setUbicacion("Consultorio 215");
        cita.setEstado("Confirmada");

        assertEquals("María López", cita.getNombreCompleto());
        assertEquals("123456789", cita.getCedula());
        assertEquals("maria@eci.edu.co", cita.getCorreo());
        assertEquals(fecha, cita.getFecha());
        assertEquals("Cardiología", cita.getEspecialidad());
        assertEquals("Dr. Gómez", cita.getDoctor());
        assertEquals("Consultorio 215", cita.getUbicacion());
        assertEquals("Confirmada", cita.getEstado());
    }

    @Test
    public void deberiaActualizarInformacionDeCita() {
        Cita cita = new Cita();
        cita.setNombreCompleto("Ana Torres");
        cita.setCedula("111222333");
        cita.setCorreo("ana@eci.co");
        cita.setFecha(LocalDate.of(2024, 10, 1));
        cita.setEspecialidad("Neurología");
        cita.setDoctor("Dr. Salazar");
        cita.setUbicacion("Sala 9");
        cita.setEstado("Pendiente");

        assertEquals("Ana Torres", cita.getNombreCompleto());
        assertEquals("111222333", cita.getCedula());
        assertEquals("ana@eci.co", cita.getCorreo());
        assertEquals(LocalDate.of(2024, 10, 1), cita.getFecha());
        assertEquals("Neurología", cita.getEspecialidad());
        assertEquals("Dr. Salazar", cita.getDoctor());
        assertEquals("Sala 9", cita.getUbicacion());
        assertEquals("Pendiente", cita.getEstado());
    }
}
