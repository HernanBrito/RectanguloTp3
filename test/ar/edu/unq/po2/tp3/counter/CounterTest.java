package ar.edu.unq.po2.tp3.counter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	Counter counter;
    @BeforeEach
    public void setUp() throws Exception {
    	counter = new Counter();
        
        // Se agregan los numeros. Un solo par y nueve impares
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
    }
	
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
		int amount = counter.getNumerosPares();
		// I check the amount is the expected one
		assertEquals(amount, 1);
	}
	
	@Test
	public void testOddNumbers() {
		
		int amount = counter.getNumerosImpares();
		assertEquals(amount , 9);
		
	}
	
	@Test
	public void testMultiplos() {
		int amount = counter.getNumerosMultiplosDe(4);
		assertEquals(amount, 1);
	}
	


}
