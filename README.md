# Validador de Correlatividades

---
Entrega de ejercicio "Validador de Correlatividades".
 - Comisión/es: K3052 / K3152

---

### Diagrama de clases

El diagrama de clases del ejercicio se presenta como pseudocódigo de PlantUML (para no enviar imágenes al repositorio).

 - link: [plantUML]() 

```
@startuml

class Materia {
  - nombre: String
  - correlativas: List<Materia>
}

class Alumno {
  - materiasAprobadas: List<Materia>
  + aprobarMateria(materia Materia): void
  + esMateriaAprobada(materia Materia): Boolean
}

class Inscripcion {
    - alumno: Alumno
    - materias: List<Materias>
    + aprobada(): Boolean
}

Alumno o-- Materia

Alumno *-- Inscripcion

Alumno ..> Materia

Inscripcion --> "*" Materia

Materia --> "*" Materia

@enduml
```