package ar.edu.unq.po2.tp3.rectangulo;
import ar.edu.unq.po2.tp3.point.Punto;

public class Rectangulo {
    private Punto esquinaInfIzq;
    private int base;
    private int altura;

    public Rectangulo(Punto esquinaInfIzq, int base, int altura) {
        this.esquinaInfIzq = esquinaInfIzq;
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public int getArea() {
        return base * altura;
    }

    public int getPerimetro() {
        return 2 * (base + altura);
    }
    
    public String orientacion() {
        if (altura > base) {
            return "Vertical";
        } else{
            return "Horizontal";
        }
    }
    public Punto getEsquinaInfDer() {
        return new Punto(esquinaInfIzq.getX() + base, esquinaInfIzq.getY());
    }
    
    public Punto getEsquinaSupIzq() {
        return new Punto(esquinaInfIzq.getX(), esquinaInfIzq.getY() + altura);
    }
    
    public Punto getEsquinaSupDer() {
        return new Punto(esquinaInfIzq.getX() + base, esquinaInfIzq.getY() + altura);
    }
}