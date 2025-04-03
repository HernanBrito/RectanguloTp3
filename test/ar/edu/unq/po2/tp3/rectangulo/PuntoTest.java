package ar.edu.unq.po2.tp3.rectangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PuntoTest {

	Punto p;

	@BeforeEach
	public void setUp() {
		p = new Punto(1, 2);
	}

	@Test
	public void testearGetter() {
		assertEquals(1, p.getX(), "El getter no está funcionado correctamente");
	}

	@Test
	public void testearSetter() {
		p.setX(5);
		assertEquals(5, p.getX(), "El setter no está funcionado correctamente");
	}

}
