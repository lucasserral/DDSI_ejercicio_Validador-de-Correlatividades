package Sistema;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {

    @Test
    @DisplayName("Se crea una materia con nombre y su getter")
    public void crearMateria() {
        Materia analisisMatematico = new Materia("Análisis Matemático");

        Assertions.assertInstanceOf(Materia.class, analisisMatematico);
        Assertions.assertEquals("Análisis Matemático", analisisMatematico.getNombre());
    }

    @Test
    @DisplayName("Se crea una materia con correlativas")
    public void crearMateriaConCorrelativas() {
        Materia analisisMatematico = new Materia("Análisis Matemático");
        Materia algebraI = new Materia("Algerba I");
        Materia algoritmos = new Materia("Algoritmos");
        Materia analisisMatematicoII = new Materia("Análisis Matemático II", analisisMatematico, algebraI);

        Assertions.assertTrue(analisisMatematicoII.getCorrelativas().contains(analisisMatematico));
        Assertions.assertTrue(analisisMatematicoII.getCorrelativas().contains(algebraI));
        Assertions.assertFalse(analisisMatematicoII.getCorrelativas().contains(algoritmos));
    }
}