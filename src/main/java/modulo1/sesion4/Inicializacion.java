package modulo1.sesion4;

public class Inicializacion {
    public static void main(String[] args) {
        byte i = 4;
        Alumno al = new Alumno("Java SE", i, "Dominar java");
        System.out.println(al.getObjetivo());
    }
}
