package Sistema;

import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
    private Alumno alumno;
    private Set<Materia> materias;

    public Inscripcion(Alumno alumno, Materia ... materias) {
        this.alumno = alumno;
        this.materias = new HashSet<>(Set.of(materias));
    }

    public Boolean aprobada() {
        return this.materias.stream().allMatch(materia -> materia.getCorrelativas().stream()
                .allMatch(correlativa -> this.alumno.esMateriaAprobada((correlativa))));
    }
}
