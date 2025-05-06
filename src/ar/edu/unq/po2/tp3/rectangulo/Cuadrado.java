package ar.edu.unq.po2.tp3.rectangulo;
import ar.edu.unq.po2.tp3.point.Punto;

public class Cuadrado extends Rectangulo {
    public Cuadrado(Punto esquinaInfIzq, int lado) {
        super(esquinaInfIzq, lado, lado);
    }

    public int getLado() {
        return getAltura(); //
    }

    @Override
    public String orientacion() {
        return "Cuadrado";
    }
}