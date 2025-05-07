package ar.edu.unq.po2.tp3.equipoDeTrabajo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class EquipoTrabajoTest {
	Persona persona1;
	Persona persona2;
	Persona persona3;
	Persona persona4;
	Persona persona5;
	EquipoDeTrabajo equipo;
	
	@BeforeEach
	public void setUp() {
		persona1 = new Persona("Juan", "Pérez", 25);
		persona2 = new Persona("María", "Gómez", 30);
		persona3 = new Persona("Carlos", "López", 22);
		persona4 = new Persona("Ana", "Martínez", 28);
		persona5 = new Persona("Pedro", "Rodríguez", 35);
		equipo = new EquipoDeTrabajo("Fuerza Colectiva");
		equipo.addEmpleado(persona1);
		equipo.addEmpleado(persona2);
		equipo.addEmpleado(persona3);
		equipo.addEmpleado(persona4);
		equipo.addEmpleado(persona5);
	}
	
	@Test
	void testNombre(){
		assertEquals("Juan", persona1.getNombre());
		assertEquals("María", persona2.getNombre());
		assertEquals("Carlos", persona3.getNombre());
		assertEquals("Ana", persona4.getNombre());
		assertEquals("Pedro", persona5.getNombre());
	}
	@Test
	void testApellido(){
		assertEquals("Pérez", persona1.getApellido());
		assertEquals("Gómez", persona2.getApellido());
		assertEquals("López", persona3.getApellido());
		assertEquals("Martínez", persona4.getApellido());
		assertEquals("Rodríguez", persona5.getApellido());
	}
	
	@Test
	void testEdad(){
		assertEquals(25, persona1.getEdad());
		assertEquals(30, persona2.getEdad());
		assertEquals(22, persona3.getEdad());
		assertEquals(28, persona4.getEdad());
		assertEquals(35, persona5.getEdad());
	}
	@Test
	void testNombreEquipo() {
		assertEquals("Fuerza Colectiva", equipo.getNombreEquipo());
	}
	@Test
	void testPromedioEdad() {
		assertEquals(28, equipo.promedioEdadDeTrabajadores());
	}

}
