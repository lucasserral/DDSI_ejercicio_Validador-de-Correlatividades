# Validador de Correlatividades

---
Entrega de ejercicio "Validador de Correlatividades".
 - Comisión/es: K3052 / K3152

---

### Diagrama de clases

El diagrama de clases del ejercicio se presenta como pseudocódigo de PlantUML (para no enviar imágenes al repositorio).

 - link: [plantUML](//www.plantuml.com/plantuml/png/RP1BJiCm48RtESMegrBg7C12KGih95XnWgbj8Kj-L6Ed6yJTgTnnOzFielyn-JyVKaRAitV3e1oc19-O3Lc4dm50G8Z-H4R2LoORleka8f5ncEq5auGFc_8BTwQh_rmFRFlg_bzl74SEFfKMQlss1BR-vacuXtxhmAERVOYyZtFfUAPuGhs-28j9h3tUbd29LfUeIIpMWslfrnYTmL0AYWpIUqYAx5dP63ZFY4sfoImiZSX0MEWaKtQCFLgwiRM_xhlxMbnxxKhNq5n7yTD68UhmkxOJeaEe-ZXEIxR54MA2pMwpcFpnQ1nCqBDtVm00) 

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