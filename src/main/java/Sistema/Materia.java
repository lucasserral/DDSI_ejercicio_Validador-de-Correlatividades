package Sistema;

import java.util.HashSet;
import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Materia> correlativas;

    public Materia (String nombre, Materia ... materias) {
        this.nombre = nombre;
        this.correlativas = new HashSet<>(Set.of(materias));
    }

    public void addCorrelativa(Materia materia) {
        this.correlativas.add(materia);
    }

    public Set<Materia> getCorrelativas() {
        return this.correlativas;
    }

    public String getNombre() {
        return this.nombre;
    }
}
