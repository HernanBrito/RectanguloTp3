package ar.edu.unq.po2.tp3.multiOperador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MultiOperadorTest {
	
	MultiOperador multiOperador;
	
	@BeforeEach
    public void setUp() throws Exception {
    	multiOperador = new MultiOperador();
        
        
    	multiOperador.addNumber(1);
    	multiOperador.addNumber(3);
    	multiOperador.addNumber(4);
    	multiOperador.addNumber(20);
    	multiOperador.addNumber(21);
    	multiOperador.addNumber(27);
    	multiOperador.addNumber(71);
    	multiOperador.addNumber(23);
    	multiOperador.addNumber(31);
    	multiOperador.addNumber(9);
    }
	
	
    @Test
    public void testSuma() {
        assertEquals(210, multiOperador.sumador());
    }

    @Test
    public void testResta() {
        assertEquals(-208, multiOperador.restador());
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(61999000560L, multiOperador.multiplicador());
    }
}
