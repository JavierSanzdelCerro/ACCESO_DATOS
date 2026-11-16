package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@ToString
@EqualsAndHashCode
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autonumerico
    Long id;
    String nombre;
    String apellidos;
    @Column(length = 9)
    String dni;
    String email;
    private LocalDateTime createdAt;

    // @Basic
    // @Column

    @PrePersist // Guarda antes de hacer el save
    public void preGuardar(){
        this.createdAt = LocalDateTime.now();
    }

    @PostPersist
    public void postGuardado(){
        System.out.println("Se guarda la persona con ID: " + this.id);
    }

    @OneToOne(cascade = CascadeType.ALL)
    Coche coche;

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", coche=" + coche.getId() + " " + coche.getMatricula() +
                '}';
    }
}
