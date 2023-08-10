package modulo1.sesion4;

public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;

    {
        System.out.println("Hola");
        curso = "Java SE";
        sesion = 4;
        objetivo = "Dominar java";
    }

    public Alumno(String curso, byte sesion, String objetivo) {
        this.curso = curso;
        this.objetivo = objetivo;
        this.sesion = sesion;
    }

    public Alumno(String curso) {
        this.curso = curso;
    }

    public Alumno() {
        curso = "Java SE";
        sesion = 0;
        objetivo = "Programacion web";
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public byte getSesion() {
        return sesion;
    }

    public void setSesion(byte sesion) {
        this.sesion = sesion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }


}
