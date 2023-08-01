package modulo1.Sesion3;

public class Vehiculo {
    private Combustible c;
    private Llanta l1;
    private Llanta l2;
    private Llanta l3;
    private Llanta l4;
    private int kilometros = 0;

    public Vehiculo(Combustible c, Llanta l1, Llanta l2, Llanta l3, Llanta l4) {
        this.c = c;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }

    public Combustible getC() {
        return c;
    }

    public void setC(Combustible c) {
        this.c = c;
    }

    public Llanta getL1() {
        return l1;
    }

    public void setL1(Llanta l1) {
        this.l1 = l1;
    }

    public Llanta getL2() {
        return l2;
    }

    public void setL2(Llanta l2) {
        this.l2 = l2;
    }

    public Llanta getL3() {
        return l3;
    }

    public void setL3(Llanta l3) {
        this.l3 = l3;
    }

    public Llanta getL4() {
        return l4;
    }

    public void setL4(Llanta l4) {
        this.l4 = l4;
    }

    public void avanzar() {
        if (c.getLitrosActuales() > 0) {
            this.kilometros++;
            c.gastarCombustible();
            l1.rodar();
            l2.rodar();
            l3.rodar();
            l4.rodar();
            System.out.println("Se han avanzado " + kilometros + " kilometros en total");
        } else {
            c.gastarCombustible();
        }
    }
}
