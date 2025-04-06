package Sistema;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    @DisplayName("Crear inscripción fuera de alumno")
    public void crearInscripcionFueraDeAlumno(){

        Alumno alumno = new Alumno();
        Materia algebra = new Materia("Algebra");

        Inscripcion inscripcion = new Inscripcion(alumno, algebra);

        Assertions.assertSame(inscripcion.getAlumno(), alumno);
    }

    @Test
    @DisplayName("No permitir crear inscripcion sin materias")
    public void crearInscripcionSinMateria(){

        Alumno alumno = new Alumno();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Inscripcion(alumno);
        }, Inscripcion.ErrorUnaMateriaMinimo);
    }

    @Test
    @DisplayName("Inscripcion no aprobada")
    public void inscripcionNoAprobada() {
        Materia analisisMatematico = new Materia("Análisis Matemático");
        Materia algebraI = new Materia("Algerba I");
        Materia analisisMatematicoII = new Materia("Análisis Matemático II", analisisMatematico, algebraI);

        Alumno alumno = new Alumno();
        alumno.aprobarMateria(analisisMatematico);

        Inscripcion inscripcion = alumno.crearInscripcion(analisisMatematicoII);

        Assertions.assertFalse(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Inscripcion aprobada")
    public void inscripcionAprobada() {
        Materia analisisMatematico = new Materia("Análisis Matemático");
        Materia algebraI = new Materia("Algerba I");
        Materia analisisMatematicoII = new Materia("Análisis Matemático II", analisisMatematico, algebraI);

        Alumno alumno = new Alumno();
        alumno.aprobarMateria(analisisMatematico);
        alumno.aprobarMateria(algebraI);

        Inscripcion inscripcion = alumno.crearInscripcion(analisisMatematicoII);

        Assertions.assertTrue(inscripcion.aprobada());
    }

}