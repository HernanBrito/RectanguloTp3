package ar.edu.unq.po2.tp3.multiOperador;

import java.util.ArrayList;
import java.util.List;

public class MultiOperador {
	private List<Integer> listaNums = new ArrayList<Integer>();
	
	
	public void addNumber(Integer num) {
		listaNums.add(num);
	}
	
	public int sumador() {
		
		if (listaNums.isEmpty()) return 0;
		int sumaTotal = listaNums.get(0);
		
		for (int i = 1 ; i < listaNums.size() ; i++) {
			sumaTotal = sumaTotal + listaNums.get(i);
		}
		
		return sumaTotal;
	}
	
	public int restador() {
		
		if (listaNums.isEmpty()) return 0;
		int restaTotal = listaNums.get(0);
		
		for (int i = 1 ; i < listaNums.size() ; i++) {
			restaTotal = restaTotal - listaNums.get(i);
		}
		
		return restaTotal;
	}
	
	public long  multiplicador() {
		//Utilizo long porque con int en algunos casos podr'ia causar overflow
		if (listaNums.isEmpty()) return 0;
		long  multiplicacionTotal = listaNums.get(0);
		
		for (int i = 1 ; i < listaNums.size() ; i++) {
			multiplicacionTotal = multiplicacionTotal + listaNums.get(i);
		}
		
		return multiplicacionTotal;
	}	
	
}
