package Sistema;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private Set<Materia> materiasAprobadas;

    public Alumno() {
        this.materiasAprobadas = new HashSet<Materia>();
    }

    public void aprobarMateria(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

    public Boolean esMateriaAprobada(Materia materia) {
        return this.materiasAprobadas.contains(materia);
    }

    public Inscripcion crearInscripcion(Materia ... materias){
        return new Inscripcion(this, materias);
    }
}
