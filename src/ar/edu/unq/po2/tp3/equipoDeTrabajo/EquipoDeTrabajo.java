package ar.edu.unq.po2.tp3.equipoDeTrabajo;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombreEquipo;
	private ArrayList<Persona> integrantes = new ArrayList<Persona>();
	
	public void addEmpleado(Persona persona) {
		integrantes.add(persona);
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	public double promedioEdadDeTrabajadores() {
		double edadTotal=0;
		for (Persona persona : integrantes) {
			edadTotal += persona.getEdad();
		}
		return (edadTotal / integrantes.size());
	}
	
	public EquipoDeTrabajo(String nombre) {
		nombreEquipo=nombre;
	}
	
}
