package Modulo;

public class Biblioteca {
    private Socio listaSocios [];

    private Libro libros[];
    private int cantSocios;
    private int cantLibros;

    public Biblioteca(Socio listaSocios[], Libro libros[])
    {
        listaSocios= new Socio[100];
        this.cantSocios=0;
        libros= new Libro[100];
        this.cantLibros=0;
    }
    //crearUsuario, crearLibros, "prestar, devolver", SETTER GETTER
    public static void agregarSocio(String nombre, int cantSocios, Socio listaSocios[])
    {
        listaSocios[cantSocios]= new Socio(nombre,cantSocios);
    }
    public static void agregarLibro(Libro libros[], int cantLibros, String nombre, int cantCopias)
    {
        libros[cantLibros]=new Libro(cantCopias,nombre);
    }
    public static void prestarLibro(Socio listaSocios[], Libro libros[], int id, String nombreLibro)
    {
        //se busca la disponibilidad y si existe tal libro
    }
    public int buscarLibro(String nombreLibro)
    {
        int contador = 0;
        int cantLibros  = -1;//devuelve -1 si el libro no existe en la biblioteca.

        while((contador < this.cantLibros)&&(this.libros[contador].getTitulo().equalsIgnoreCase(nombreLibro))){
            contador++;
        }
        if(contador !=this.cantLibros)
        {
            cantLibros = this.cantLibros;
        }

        return cantLibros;
    }
}
