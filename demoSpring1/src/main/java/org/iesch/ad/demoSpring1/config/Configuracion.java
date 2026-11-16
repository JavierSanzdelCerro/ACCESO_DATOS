package org.iesch.ad.demoSpring1.config;


import org.iesch.ad.demoSpring1.modelo.Persona;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Configuracion {

    /*@Bean
    public List<Persona> dameLista(){

        List<Persona> listaPersonas = new ArrayList<>();

        Persona p2 = Persona.builder().nombre("Javier").build();
        Persona p3 = Persona.builder().nombre("Ana").build();
        Persona p4 = Persona.builder().nombre("Rubia").build();
        Persona p5 = Persona.builder().nombre("Morena").build();
        Persona p6 = Persona.builder().nombre("Asun").build();
        Persona p7 = Persona.builder().nombre("Paula").build();

        listaPersonas.add(p2);
        listaPersonas.add(p3);
        listaPersonas.add(p4);
        listaPersonas.add(p5);
        listaPersonas.add(p6);
        listaPersonas.add(p7);

        return listaPersonas;
    }*/

}
