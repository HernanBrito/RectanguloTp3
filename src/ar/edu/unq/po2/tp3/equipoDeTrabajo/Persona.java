package ar.edu.unq.po2.tp3.equipoDeTrabajo;

public class Persona {
	private String nombre;
	private String apellido;
	private Integer edad;
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Integer getEdad() {
		return edad;
	}
	
	public Persona(String nombreP, String apellidoP, Integer edadP) {
		nombre = nombreP;
		apellido = apellidoP;
		edad = edadP;
	}
	
}
