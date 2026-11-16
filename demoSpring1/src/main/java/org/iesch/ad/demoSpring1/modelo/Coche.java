package org.iesch.ad.demoSpring1.modelo;


import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
@Entity
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String marca;
    String modelo;
    String matricula;


    @OneToOne(cascade = CascadeType.ALL)
    Persona persona;

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", persona=" + persona +
                '}';
    }
}
