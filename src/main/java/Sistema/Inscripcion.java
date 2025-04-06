package Sistema;

import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
    private Alumno alumno;
    private Set<Materia> materias;

    static public String ErrorUnaMateriaMinimo = "Al menos una materia es necesaria";

    public Inscripcion(Alumno alumno, Materia ... materias) {
        if (materias.length == 0) {
            throw new IllegalArgumentException(Inscripcion.ErrorUnaMateriaMinimo);
        }
        this.alumno = alumno;
        this.materias = new HashSet<>(Set.of(materias));
    }

    public Alumno getAlumno(){
        return this.alumno;
    }

    public Boolean aprobada() {
        return this.materias.stream().allMatch(materia -> materia.getCorrelativas().stream()
                .allMatch(correlativa -> this.alumno.esMateriaAprobada((correlativa))));
    }
}
