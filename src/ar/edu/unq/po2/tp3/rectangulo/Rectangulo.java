package ar.edu.unq.po2.tp3.rectangulo;

import ar.edu.unq.po2.tp3.point.Punto;

public class Rectangulo {
	private int base;
	private int altura;
	private Punto puntoOrigen;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Punto getPuntoOrigen() {
		return puntoOrigen;
	}

	public void setPuntoOrigen(Punto puntoOrigen) {
		this.puntoOrigen = puntoOrigen;
	}

	public Rectangulo(int base, int altura, Punto puntoOrigen) {
		super();
		this.base = base;
		this.altura = altura;
		this.puntoOrigen = puntoOrigen;
	}

	public void Prueba() {

	}

}
