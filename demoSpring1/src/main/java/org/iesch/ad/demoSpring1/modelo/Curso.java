package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    String nombre;

    @ToString.Exclude  // Evitar stackOverflow
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "cursos") // Nombre de la variable en la otra entidad
    // (cascade = CascadeType.All) peligros, ya que si borramos un curso
    // se puede dt el caso que borres al padre (estudiante)
    // y también al resto de curso del estudiante
    // Se recomienda: CascadeType.Persist y MERGE
    // Con Persist al guardar se guardaría también al padre
    // Con Merge al actualizar se actualiza
    private Set<Student> students = new HashSet<>();

}