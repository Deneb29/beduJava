package modulo1.Sesion3;

import java.io.Console;

public class Consola {
    public static void main(String[] args) {
        Console c = System.console();
        if (c == null) {
            System.err.println("No hay consola");
            System.exit(1);
        }
        System.out.println("Escribe tu nombre");
        String nombre = c.readLine();
        System.out.println("Hola " + nombre);
    }
}
