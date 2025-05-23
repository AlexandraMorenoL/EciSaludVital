package eci.edu.cvds.EciSaludVital.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EspecialidadTest{
    public void crearEspecialidad(){
        Especialidad esp = new Especialidad("Odontología", "Problemas cordales", "radiografía.jpg", "Dra.Ayala","Consultorio 402, Cuarto piso." );

        assertEquals("Odontología", esp.getNombre());
        assertEquals("Dra.Ayala", esp.getDoctor());
        assertNotNull(esp.getImagen());
   
    }
}