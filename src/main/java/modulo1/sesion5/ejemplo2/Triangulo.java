package modulo1.sesion5.ejemplo2;

public class Triangulo extends Figura {
    private final String TIPO;

    public Triangulo(double base, double altura, String tipo) {
        super(base, altura);
        TIPO = tipo;
    }

    public double area() {
        return getBASE() * getALTURA() / 2;
    }

}
