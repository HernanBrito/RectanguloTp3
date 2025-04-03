package ar.edu.unq.po2.tp3.rectangulo;

public class Punto {

	private int x;
	private int y;
	private String color;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Punto(int x, int y, String color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.color = "white";
	}

}
