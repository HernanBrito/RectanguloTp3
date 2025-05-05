package ar.edu.unq.po2.tp3.point;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.point.Punto;

public class PuntoTest {

	Punto p1;
	Punto p2;

	@BeforeEach
	public void setUp() {
		p1 = new Punto(1, 2);
		p2 = new Punto(3, 4);
	}

	@Test
	public void testearGetter() {
		assertEquals(1, p1.getX(), "El getter está funcionado correctamente");
	}

	@Test
	public void testearSetter() {
		p1.setX(5);
		assertEquals(5, p1.getX(), "El setter está funcionado correctamente");
	}
	
    @Test
    public void testConstructorSinParametros() {
        Punto p0 = new Punto();
        assertEquals(0, p0.getX());
        assertEquals(0, p0.getY());
    }
    
    @Test
    public void testearGetterY() {
        assertEquals(2, p1.getY());
    }
    
    @Test
    public void testearSetterY() {
        p1.setY(6);
        assertEquals(6, p1.getY());
    }
    
    @Test
    public void testMoverPunto() {
        p1.moverXMoverY(7, 8);
        assertEquals(7, p1.getX());
        assertEquals(8, p1.getY());
    }
    
    @Test
    public void testSumarPuntos() {
        Punto resultado = p1.sumarPuntos(p1, p2);
        assertEquals(4, resultado.getX()); // 1 + 3
        assertEquals(6, resultado.getY()); // 2 + 4
    }
    
    @Test
    public void testSumarPuntoCero() {
        Punto p0 = new Punto();
        Punto resultado = p1.sumarPuntos(p1, p0);
        assertEquals(p1.getX(), resultado.getX());
        assertEquals(p1.getY(), resultado.getY());
    }
    
    @Test
    public void testSumarPuntosNegativos() {
        Punto pNeg = new Punto(-2, -3);
        Punto resultado = p1.sumarPuntos(p1, pNeg);
        assertEquals(-1, resultado.getX()); // 1 + (-2)
        assertEquals(-1, resultado.getY()); // 2 + (-3)
    }
    
    @Test
    public void testSumarPuntosConmutativa() {
        Punto res1 = p1.sumarPuntos(p1, p2);
        Punto res2 = p1.sumarPuntos(p2, p1);
        assertEquals(res1.getX(), res2.getX());
        assertEquals(res1.getY(), res2.getY());
    }
}

