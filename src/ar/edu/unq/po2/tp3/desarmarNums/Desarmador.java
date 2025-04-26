package ar.edu.unq.po2.tp3.desarmarNums;
import java.util.ArrayList;
import java.util.List;


public class Desarmador {
	
	private List<Integer> listaNums = new ArrayList<Integer>();
	
	public void addNumber(Integer num) {
		listaNums.add(num);
	}
	
	public int getNumber(int index) {
		return listaNums.get(index);
	}
	
	public int cantidadDeDigitosPares(int num) {
		int cantidadDeDigitosPares = 0;
		
		num = Math.abs(num);
		
		while(num != 0) {
			int ultDigito = num % 10;
			if(ultDigito % 2 == 0) {
				cantidadDeDigitosPares++;
			}
			num = num / 10;
		}
		return cantidadDeDigitosPares;
	}
	
	
	public int numConMasDigitosPar() {
		
		int numConMasDigitosPar = listaNums.get(0);
		
		for(int i = 1 ; i < listaNums.size() ; i++ ) {
				if( (listaNums.get(i) != 0) ) {
					
					if( cantidadDeDigitosPares(listaNums.get(i)) > cantidadDeDigitosPares(numConMasDigitosPar) ){
					numConMasDigitosPar = listaNums.get(i);
				}
			}
		}	
		return numConMasDigitosPar;
	}
}
	

