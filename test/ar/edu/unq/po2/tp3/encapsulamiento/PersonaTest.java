package ar.edu.unq.po2.tp3.encapsulamiento;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PersonaTest {
	Persona persona;
	Persona persona2;
	
	@BeforeEach
	public void setUp() {
		persona = new Persona("Carlos", LocalDate.of(2000,5,2));
		persona2 = new Persona("Carla", LocalDate.of(1990, 2, 23));
	}
	
	@Test
	void testNombre(){
		assertEquals("Carlos", persona.getNombre());
		assertEquals("Carla", persona2.getNombre());
	}
	@Test
	void testFecNac(){
		assertEquals(LocalDate.of(2000, 5, 2), persona.getFecNac());
		assertEquals(LocalDate.of(1990, 2, 23), persona2.getFecNac());
	}
	@Test
	void testEdad(){
		assertEquals(25, persona.getEdad());
		assertEquals(35, persona2.getEdad());
	}
	@Test
	void testMenorQue() {
		assertTrue(persona.menorQue(persona2));
	}
}
