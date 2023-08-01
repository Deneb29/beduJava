package modulo1.Sesion3;

public class Reto2 {
    public static void main(String[] args) {
        Combustible c = new Combustible(50, 5);
        Llanta l1 = new Llanta(20, 20, 20);
        Llanta l2 = new Llanta(20, 20, 20);
        Llanta l3 = new Llanta(20, 20, 20);
        Llanta l4 = new Llanta(20, 20, 20);
        Vehiculo v = new Vehiculo(c, l1, l2, l3, l4);

        for (int i = 0; i < 10; i++) {
            v.avanzar();
        }
    }
}
