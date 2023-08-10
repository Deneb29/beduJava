package modulo1.sesion5.ejemplo1;

public class MiembrosEstaticos {
    private static short contadorClase;
    private short contadorInstancia;

    public MiembrosEstaticos() {
        contadorInstancia++;
        contadorClase++;
    }

    public static short getContadorClase() {
        return contadorClase;
    }

    public short getContadorInstancia() {
        return contadorInstancia;
    }
}
