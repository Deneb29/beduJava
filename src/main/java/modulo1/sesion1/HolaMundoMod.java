package modulo1.sesion1;

public class HolaMundoMod {
    public static void main(String[]args){
        try {
            System.out.println("Hola "+args[0]);
        }
        catch (Exception e){
            System.out.println("Argumento inválido");
        }

    }
}
