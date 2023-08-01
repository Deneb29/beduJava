package modulo1.Sesion3;

public class Letras {
    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.muestraMensaje("Escribe el mensaje");
        String texto = lector.leeEntrada();
        texto = texto.toLowerCase();

        Contador contador = new Contador();
        int numN = contador.cuentaNumeros(texto);
        int numV = contador.cuentaVocales(texto);
        int numC = contador.cuentaConsonantes(texto);
        int numS = contador.cuentaSimbolos(texto);

        lector.muestraMensaje("Hay " + numV + " vocales");
        lector.muestraMensaje("Hay " + numN + " numeros");
        lector.muestraMensaje("Hay " + numC + " consonantes");
        lector.muestraMensaje("Hay " + numS + " simbolos");

    }
}
