package modulo1.Sesion3;

public class Combustible {
    private int litrosMaximos;
    private int litrosActuales;

    public Combustible(int litrosMaximos, int litrosActuales) {
        this.litrosMaximos = litrosMaximos;
        this.litrosActuales = litrosActuales;
    }

    public int getLitrosMaximos() {
        return litrosMaximos;
    }

    public void setLitrosMaximos(int litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }

    public int getLitrosActuales() {
        return litrosActuales;
    }

    public void setLitrosActuales(int litrosActuales) {
        this.litrosActuales = litrosActuales;
    }

    public void gastarCombustible() {
        if (litrosActuales > 0) {
            litrosActuales--;
            System.out.println("Litros restantes: " + this.litrosActuales);
        } else {
            System.out.println("No queda combustible");
        }
    }
}
