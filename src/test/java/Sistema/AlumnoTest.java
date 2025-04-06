package Sistema;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    @DisplayName("Validación de materias aprobadas")
    public void validarMateriaAprobada(){

        Materia algebra = new Materia("Algebra");
        Materia analisis = new Materia("analisis");

        Alumno alumno = new Alumno();
        alumno.aprobarMateria(algebra);

        Assertions.assertTrue(alumno.esMateriaAprobada(algebra));
        Assertions.assertFalse(alumno.esMateriaAprobada(analisis));
    }

    @Test
    @DisplayName("Crear inscripcion desde alumno")
    public void alumnoCreaInscripcion(){

        Materia algebra = new Materia("Algebra");
        Alumno alumno = new Alumno();

        Inscripcion inscripcion = alumno.crearInscripcion(algebra);

        Assertions.assertSame(inscripcion.getAlumno(), alumno);
    }
}