package org.iesch.ad.demoSpring1;

import lombok.RequiredArgsConstructor;
import org.iesch.ad.demoSpring1.modelo.Coche;
import org.iesch.ad.demoSpring1.modelo.Curso;
import org.iesch.ad.demoSpring1.modelo.Persona;
import org.iesch.ad.demoSpring1.modelo.Student;
import org.iesch.ad.demoSpring1.repositorio.CocheRepositorio;
import org.iesch.ad.demoSpring1.repositorio.CursoRepositorio;
import org.iesch.ad.demoSpring1.repositorio.PersonaRepositorio;
import org.iesch.ad.demoSpring1.repositorio.StudentRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
//@RequiredArgsConstructor
public class DemoSpring1Application implements CommandLineRunner {

	/*@Value("${mi.app.nombre}")
	String nombre;
	@Value("${mi.app.version}")
	String version;
	@Value("${firma}")
	String firma;*/

	/*@Autowired
	List<Persona> listaPersona;*/

	@Autowired
	PersonaRepositorio personaRepositorio;

	@Autowired
	CocheRepositorio cocheRepositorio;

	@Autowired
	StudentRepositorio studentRepositorio;

	@Autowired
	CursoRepositorio cursoRepositorio;

	// OPCIÓN DE INYECCIÓN DE DEPENDENCIAS DESDE EL CONSTRUCTOR
	//PersonaRepositorio personaRepositorio;

	public DemoSpring1Application(PersonaRepositorio personaRepositorio) {
		this.personaRepositorio = personaRepositorio;
	}

	// OTRA OPCIÓN DE INYECCIÓN DE DEPENDENCIAS CON @RequiredArgsConstructor
	// PersonaRepositorio personaRepositorio;

	// OTRA OPCIÓN DE HACERLO
	/*@Autowired
	PersonaRepositorio personaRepositorio*/

	public static void main(String[] args) {
		SpringApplication.run(DemoSpring1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*System.out.println("Hola mundo");
		//System.out.println(listaPersona)*/;

		/*Persona p = Persona.builder().nombre("Pablo").apellidos("Neruda").email("pablo@neruda.org").dni("1844455A").build();
		Persona p2 = Persona.builder().nombre("Pedro").apellidos("Sanchez").email("pedro@sanchez.org").dni("18555777A").build();
		Persona p3 = Persona.builder().nombre("Santiago").apellidos("Abascal").email("santi@abascal.org").dni("18333222A").build();
		Persona p4 = Persona.builder().nombre("Alberto").apellidos("Nuñez").email("alberto@nunez.org").dni("1999555A").build();*/

		/*Persona p = new Persona();
		p.setNombre("Juanjo");
		p.setApellidos("Julian Juan");
		System.out.println(p);
		List<Persona> listaPersonas = new ArrayList<>(Arrays.asList(p));
		personaRepositorio.saveAll(listaPersonas);*/


		/*
		//CRUD
		List<Persona> personaList1 = personaRepositorio.findAll();
		System.out.println(personaList1);

		// select * from _____ where id = 4
		Optional<Persona> personaEncontradaPorId = personaRepositorio.findById(4L);

		if (personaEncontradaPorId.isPresent()){
			System.out.println(personaEncontradaPorId.get());
		}else{
			System.out.println("Persona no encontrada");
		}

		// UPDATE
		// Estamos trabajando con personaEncontradaPorId
		if (personaEncontradaPorId.isPresent()){
			personaEncontradaPorId.get().setNombre("Totoni");
			personaEncontradaPorId.get().setNombre("Perez Castro");
			personaEncontradaPorId.get().setDni("18554444D");
			personaEncontradaPorId.get().setEmail("toni@aa.es");

			// Guardado
			personaRepositorio.save(personaEncontradaPorId.get());
		}

		personaList1 = personaRepositorio.findAll();
		System.out.println(personaList1);

		// DELETE
		Optional<Persona> personaAborrar = personaRepositorio.findById(4L);

		if (personaAborrar.isPresent()){
			Persona personaBorra = personaAborrar.get();
			personaRepositorio.delete(personaBorra);
		}

		Persona personatmp = new Persona();
		personatmp.setId(3L);
		personaRepositorio.delete(personatmp);*/




		/*// Ejecicion de consulta HQL
		List<Persona> personasHQL = personaRepositorio.buscaTodasPersonas();
		System.out.println(personasHQL);

		List<Persona> personasSQL = personaRepositorio.buscaTodasPersonasSQL();
		System.out.println(personasSQL);


		System.out.println("pseudo-lenguaje");
		// Buscamos las personas que su nombre empiece por 'J'
		List<Persona> personasComienzanPorJ = personaRepositorio.findByNombreStartingWith('J');
		System.out.println(personasComienzanPorJ);

		// Buscamos las personas cuya lettra del dni sea 'A' y el apellido contenga 'R'
		List<Persona> personasConDniAYApellidoConR = personaRepositorio.findByDniContainingAndApellidosContaining('A', "R");
		System.out.println(personasConDniAYApellidoConR);

		// dni con un 9 o email nulo
		List<Persona> personaEncontrada = personaRepositorio.findByDniContainingOrEmailIsNull("9");
		System.out.println(personaEncontrada);*/


		/*System.out.println("OneToOne");

		Persona persona = new Persona();
		persona.setNombre("Pepelu");
		persona.setApellidos("Sanchez");
		persona.setDni("18999555H");

		Coche coche = new Coche();
		coche.setMarca("Tesla");
		coche.setModelo("S");
		coche.setMatricula("2684KET");


		persona.setCoche(coche);
		// Guardar en BBDD
		personaRepositorio.save(persona);*/

		/*// Cargar de BBDD la persona con el ID 11
		Optional<Persona> persona = personaRepositorio.findById(11L);
		if (persona.isPresent()){
			Persona p = persona.get();
			System.out.println(p);
		}

		Optional<Coche> coche = cocheRepositorio.findById(1L);
		if (coche.isPresent()){
			Coche c = coche.get();
			System.out.println(c);
		}*/

		/*System.out.println("OneToOne Bidireccional");
		Persona persona = new Persona();
		persona.setDni("18444555N");
		persona.setNombre("Juan");
		persona.setApellidos("Perez");
		//personaRepositorio.save(persona);

		Coche c1 = new Coche();
		c1.setMatricula("4589HGF");
		//cocheRepositorio.save(c1);

		persona.setCoche(c1);
		c1.setPersona(persona);
		personaRepositorio.save(persona);*/

		/*System.out.println("Peta bidireccional");
		Optional<Persona> p = personaRepositorio.findById(16L);

		if (p.isPresent()){
			Persona persona = p.get();
			System.out.println(persona);
		}*/

		System.out.println("ManyToMany -> Unidireccional");
		/*
		Student student = new Student();
		student.setNombre("Pepito Grillo");

		Curso curso1 = new Curso();
		curso1.setNombre("PHP");

		Curso curso2 = new Curso();
		curso2.setNombre("Spring");

		Curso curso3 = new Curso();
		curso3.setNombre("Python");

		student.setCursos(Set.of(curso1, curso2, curso3));

		studentRepositorio.save(student);*/

		System.out.println("ManyToMany -> Bidireccional");

	}
}
