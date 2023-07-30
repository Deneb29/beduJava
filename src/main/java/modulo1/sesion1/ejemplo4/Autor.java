package modulo1.sesion1.ejemplo4;

public class Autor {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;

    //MÉTODOS
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

}
