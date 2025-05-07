package ar.edu.unq.po2.tp3.encapsulamiento;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombrePersona, LocalDate fecNac) {
		nombre = nombrePersona;
		fechaNacimiento = fecNac;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFecNac() {
		return fechaNacimiento;
	}
	
	public int getEdad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, hoy);
		return periodo.getYears();
	}
	
	public boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
	
}
