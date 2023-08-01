package modulo1.Sesion3;

public class Llanta {
    private int ancho;
    private int presion;
    private int diametro;

    public Llanta(int ancho, int presion, int diametro) {
        this.ancho = ancho;
        this.presion = presion;
        this.diametro = diametro;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public void rodar() {
        System.out.println("La llanta esta rodando");
    }
}
