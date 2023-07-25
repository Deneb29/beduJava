package sesion1.ejemplo4;

public class OrientacionObjetos {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNombre("Marjane");
        autor.setApellido("Satrapi");
        autor.setEdad(50);

        Libro libro = new Libro();
        libro.setTitulo("Persépolis");
        libro.setNumPages(368);
        libro.setAutor(autor);

        System.out.println("Libro: "+libro.getTitulo());
        System.out.println("Autor: "+autor.getNombre()+" "+autor.getApellido());
    }
}
