package ar.edu.unq.po2.tp3.multiplos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiploTest {
	
	Multiplo multiplo;
	
	@BeforeEach
	public void setup() {
		
		multiplo = new Multiplo();
		
		
	}
	
	@Test
	void testMayorMultiploEntre3y9() {
		assertEquals(999 , multiplo.mayorMultiploHastaMilDe(3, 9));
	}
	
	@Test
	void testMayorMultiploEntre2Y5(){
		assertEquals(1000, multiplo.mayorMultiploHastaMilDe(2, 5));
	}

	@Test
	void testMayorMultiploEntre7y13() {
	    // 7*13 = 91, el mayor múltiplo bajo 1000 es 91*10 = 910
	    assertEquals(910, multiplo.mayorMultiploHastaMilDe(7, 13));
	}

	@Test
	void testMayorMultiploEntre25y40() {
	    assertEquals(1000, multiplo.mayorMultiploHastaMilDe(25, 40));
	}

	@Test
	void testMayorMultiploEntre1001y5() {
	    // No hay múltiplos comunes dentro del rango 0-1000 por ende seria 0
	    assertEquals(0, multiplo.mayorMultiploHastaMilDe(1001, 5));
	}
	
}
