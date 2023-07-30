package modulo1.sesion2;

public class Switch {
    public static void main(String[] args) {
        boolean b = false;
        if (b) {
            System.out.println("B es verdadero");
        } else {
            System.out.println("B es falso");
        }

        String mensaje;
        byte calificacion = 5;
        switch (calificacion) {
            case 10:
                mensaje = "Excelente";
                break;
            case 9:
            case 8:
                mensaje = "Muy bien";
                break;
            case 7:
                mensaje = "Bien hecho";
                break;
            case 6:
                mensaje = "Pasaste";
                break;
            default:
                mensaje = "Vuelve a intentarlo";
        }
        System.out.println(mensaje);

        String mes = "Julio";
        switch (mes) {
            case "Enero":
                System.out.println("Febrero");
            case "Febrero":
                System.out.println("Marzo");
            case "Marzo":
                System.out.println("Abril");
            case "Abril":
                System.out.println("Mayo");
            case "Mayo":
                System.out.println("Junio");
            case "Junio":
                System.out.println("Julio");
            case "Julio":
                System.out.println("Agosto");
            case "Agosto":
                System.out.println("Septiembre");
            case "Septiembre":
                System.out.println("Octubre");
            case "Octubre":
                System.out.println("Noviembre");
            case "Noviembre":
                System.out.println("Diciembre");
            case "Diciembre":
                System.out.println("El año terminó");
        }
    }
}
