package modulo1.sesion5.ejemplo2;

public class Ejemplo2 {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(4.5, 5.2, "I");
        System.out.println(t.area());
        t.mostrarDimension();
        Rectangulo r = new Rectangulo(3.5, 4.2);
        System.out.println(r.area());
        r.mostrarDimension();
    }
}
