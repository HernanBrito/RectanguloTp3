package ar.edu.unq.po2.tp3.multiplos;

public class Multiplo {

	public boolean esMultiploDe(int num , int multiplo) {
		return (multiplo % num == 0);
	}
	
	public int mayorMultiploHastaMilDe(int x , int y) {
		int mayorMultiplo = 1000;
			while(!(esMultiploDe(x , mayorMultiplo) && esMultiploDe(y , mayorMultiplo) )) {
				mayorMultiplo = mayorMultiplo - 1;
			}
		return mayorMultiplo;
	}
	
}
