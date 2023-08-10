package modulo1.sesion4;

public class Rectangulo {
    private double alto;
    private double ancho;

    public Rectangulo() {
        this(0);
    }

    public Rectangulo(double a) {
        this(a, a);
    }

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        return ancho * alto;
    }
}
