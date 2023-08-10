package modulo1.sesion5.ejemplo2;

public class Figura {
    private final double BASE;
    private final double ALTURA;


    public Figura(double base, double altura) {
        this.BASE = base;
        this.ALTURA = altura;
    }

    public double getBASE() {
        return BASE;
    }

    public double getALTURA() {
        return ALTURA;
    }

    public void mostrarDimension() {
        System.out.println("La base es " + BASE + " y la altura es " + ALTURA);
    }

}
