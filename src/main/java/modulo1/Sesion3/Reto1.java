package modulo1.Sesion3;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese texto");
        String texto = sc.nextLine();
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("El texto contiene " + contador + " vocales");
    }
}
