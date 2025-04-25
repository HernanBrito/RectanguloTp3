package ar.edu.unq.po2.tp3.counter;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> listaNum = new ArrayList<Integer>();
	
	
    public void addNumber(int number) {
        listaNum.add(number);
    }
	
	public int getNumerosPares() {
	    int cantidadDePares = 0;
	    
	    for(int i = 0; i < listaNum.size(); i++) {
	        if(listaNum.get(i) % 2 == 0) {
	            cantidadDePares++;
	        }
	    }
	    return cantidadDePares;
	}
	
	public int getNumerosImpares() {
	    int cantidadDeImpares = 0;
	    
	    for(int i = 0; i < listaNum.size(); i++) {
	        if(listaNum.get(i) % 2 != 0) {
	            cantidadDeImpares++;
	        }
	    }
	    return cantidadDeImpares;
	}

	public int getNumerosMultiplosDe(Integer num) {
	    int cantidadDeImpares = 0;
	    
	    for(int i = 0; i < listaNum.size(); i++) {
	        if(listaNum.get(i) % num == 0) {
	            cantidadDeImpares++;
	        }
	    }
	    return cantidadDeImpares;
	}	
	
}
