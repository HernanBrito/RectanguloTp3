package ar.edu.unq.po2.tp3.rectangulo;
import ar.edu.unq.po2.tp3.point.Punto;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTest {
    private Rectangulo rectHorizontal;
    private Rectangulo rectVertical;
    private Cuadrado cuadrado;

    @BeforeEach
    void setUp() {
        rectHorizontal = new Rectangulo(new Punto(0, 0), 4, 2);
        rectVertical = new Rectangulo(new Punto(1, 1), 2, 4);
        cuadrado = new Cuadrado(new Punto(3, 3), 3);
    }

    @Test
    void testArea() {
        assertEquals(8, rectHorizontal.getArea());
        assertEquals(8, rectVertical.getArea());
        assertEquals(9, cuadrado.getArea());
    }

    @Test
    void testPerimetro() {
        assertEquals(12, rectHorizontal.getPerimetro());
        assertEquals(12, rectVertical.getPerimetro());
        assertEquals(12, cuadrado.getPerimetro());
    }

    @Test
    void testOrientacion() {
        assertEquals("Horizontal", rectHorizontal.orientacion());
        assertEquals("Vertical", rectVertical.orientacion());
        assertEquals("Cuadrado", cuadrado.orientacion());
    }

    @Test
    void testEsquinas() {
    	Punto punto1 = new Punto(4, 0);
    	Punto punto2 = new Punto(0, 2);
    	Punto punto3 = new Punto(4, 2);
        assertEquals(punto1.getX(), rectHorizontal.getEsquinaInfDer().getX());
        assertEquals(punto1.getY(), rectHorizontal.getEsquinaInfDer().getY());
        assertEquals(punto2.getX(), rectHorizontal.getEsquinaSupIzq().getX());
        assertEquals(punto2.getY(), rectHorizontal.getEsquinaSupIzq().getY());
        assertEquals(punto3.getX(), rectHorizontal.getEsquinaSupDer().getX());
        assertEquals(punto3.getY(), rectHorizontal.getEsquinaSupDer().getY());
    }

    @Test
    void testCuadradoEsRectangulo() {
        assertTrue(cuadrado instanceof Rectangulo);
    }

    @Test
    void testLadoCuadrado() {
        assertEquals(3, cuadrado.getLado());
        assertEquals(3, cuadrado.getBase());
        assertEquals(3, cuadrado.getAltura());
    }
}