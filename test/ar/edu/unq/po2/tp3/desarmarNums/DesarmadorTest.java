package ar.edu.unq.po2.tp3.desarmarNums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DesarmadorTest {
	Desarmador desarmador;
	
	@BeforeEach
    public void setUp() throws Exception {
    	desarmador = new Desarmador();
        
        // Se agregan los numeros.
    	desarmador.addNumber(2); // cantidad Digitos pares: 1
        desarmador.addNumber(30); // cantidad Digitos pares: 1
        desarmador.addNumber(151); // cantidad Digitos pares: 0
        desarmador.addNumber(72); // cantidad Digitos pares: 1
        desarmador.addNumber(91); // cantidad Digitos pares: 0
        desarmador.addNumber(1256); // cantidad Digitos pares: 3
        desarmador.addNumber(1998); // cantidad Digitos pares: 1
        desarmador.addNumber(10000); // cantidad Digitos pares:4
        desarmador.addNumber(1111111); // cantidad Digitos pares: 0
        desarmador.addNumber(404044); // cantidad Digitos pares: 6
        desarmador.addNumber(-4404044); // cantidad Digitos pares: 6

    }

	@Test
	public void testCantidadDeDigitosPar() {
		assertEquals(7 , desarmador.cantidadDeDigitosPares(desarmador.getNumber(10)));
		assertEquals(6 , desarmador.cantidadDeDigitosPares(desarmador.getNumber(9)));
		assertEquals(0 , desarmador.cantidadDeDigitosPares(desarmador.getNumber(8)));
		assertEquals(4 , desarmador.cantidadDeDigitosPares(desarmador.getNumber(7)));
		
	}
	
	@Test
	public void testElNumeroConMasDigitos() {
		assertEquals(-4404044 , desarmador.numConMasDigitosPar());
	}

	
	
}
