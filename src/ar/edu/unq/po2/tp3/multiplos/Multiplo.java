package ar.edu.unq.po2.tp3.multiplos;

public class Multiplo {

	public boolean esMultiploDe(int num , int multiplo) {
		return (multiplo % num == 0);
	}
	
	
	public int mayorMultiploHastaMilDe(int x, int y) {
	    for (int i = 1000; i > 0; i--) {
	        if (esMultiploDe(x , i) && esMultiploDe(y , i)) {
	            return i;
	        }
	    }
	    return -1; // Si no encontró ningún múltiplo
	}
	
}
