package modulo1.sesion2;

public class Ciclos {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        short[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < valores.length; i++) {
            System.out.println(i);
        }
        for (int valor : valores) {
            System.out.println(valor);
        }

        short i = 0;
        while (++i <= 10) {
            System.out.println("W" + i);
        }

        do {
            System.out.println("Hola");
        } while (false);
    }
}
