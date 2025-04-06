# Validador de Correlatividades

---
Entrega de ejercicio "Validador de Correlatividades".
 - Comisión/es: K3052 / K3152

---

### Diagrama de clases

El diagrama de clases del ejercicio se presenta como pseudocódigo de PlantUML (para no enviar imágenes al repositorio).

 - link: [plantUML](https://www.plantuml.com/plantuml/png/RP1BJiCm48RtESMegr9g7y12KGih95XnWgbj8Kj-L6Ed6yJTGMQSE3Ixw7zC_i-dN93A5FmmQ8yvmpiMImxXQm0G45Eua5NmKSZ5pohfH6Gz5dV3hE3DvVB4dV7NVsm7zklgyLzFIid1Xzf2OrwMm3xyUGhcq7SRUFPJY8dtSIwVhvGkQBONOJM9jVlR2cx9cHgrcKK-k9b-JibRZBMWoIAzngp9NRLBaVECs9MwpCBIYGo4bKunPS-uYTR_ULqzSc_piHlS35CtySic8ThkMJi8iI9ekfJZakrfX1XXTzWj9d_S6oSRpHJy3m00) 

```
@startuml

class Materia {
  - nombre: String
  - correlativas: List<Materia>
  + Materia(nombre: String, correlativas: ...Materia)
  + addCorrelativa(materia: Materia)
}

class Alumno {
  - materiasAprobadas: List<Materia>
  + aprobarMateria(materia: Materia): void
  + esMateriaAprobada(materia: Materia): Boolean
  + crearInscripcion(materias: ... Materia): Inscripcion
}

class Inscripcion {
  - alumno: Alumno
  - materias: List<Materias>
  + Inscripcion(alumno: Alumno, materias: ...Materia)
  + aprobada(): Boolean
}

Alumno o-- Materia

Alumno *-- Inscripcion

Alumno ..> Materia

Inscripcion --> "*" Materia

Materia --> "*" Materia

@enduml
```