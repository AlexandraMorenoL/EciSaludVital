package eci.edu.cvds.EciSaludVital.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EspecialidadTest {

    @Test
    public void deberiaCrearEspecialidadConDatosCompletos() {
        Especialidad esp = new Especialidad("Odontología", "Problemas cordales", "radiografía.jpg", "Dra. Ayala", "Consultorio 402, Cuarto piso.");

        assertEquals("Odontología", esp.getNombre());
        assertEquals("Problemas cordales", esp.getDescripcion());
        assertEquals("radiografía.jpg", esp.getImagen());
        assertEquals("Dra. Ayala", esp.getDoctor());
        assertEquals("Consultorio 402, Cuarto piso.", esp.getUbicacion());
    }

    @Test
    public void deberiaModificarDatosDeEspecialidad() {
        Especialidad esp = new Especialidad();
        esp.setNombre("Neurología");
        esp.setDescripcion("Sistema nervioso");
        esp.setImagen("neuro.jpg");
        esp.setDoctor("Dr. Pérez");
        esp.setUbicacion("Sala 5");

        assertEquals("Neurología", esp.getNombre());
        assertEquals("Sistema nervioso", esp.getDescripcion());
        assertEquals("neuro.jpg", esp.getImagen());
        assertEquals("Dr. Pérez", esp.getDoctor());
        assertEquals("Sala 5", esp.getUbicacion());
    }

    @Test
    public void deberiaCrearEspecialidadPediatria() {
        Especialidad esp = new Especialidad("Pediatría", "Atención infantil", "pediatria.jpg", "Dra. Castro", "Consultorio 12");

        assertEquals("Pediatría", esp.getNombre());
        assertEquals("Atención infantil", esp.getDescripcion());
        assertEquals("pediatria.jpg", esp.getImagen());
        assertEquals("Dra. Castro", esp.getDoctor());
        assertEquals("Consultorio 12", esp.getUbicacion());
    }
}
