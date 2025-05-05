package ar.edu.unq.po2.tp3.point;

public class Punto {

	private int x;
	private int y;

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

	public void moverXMoverY(int x,int y) {
		setY(y);
		setX(x);
	}

	public Punto() {
		this.x = 0;
		this.y = 0;
	}

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
    public Punto sumarPuntos(Punto punto1 , Punto punto2) {
        return new Punto(punto2.getX() + punto1.getX(), punto2.getY() + punto1.getY());
    }

}
