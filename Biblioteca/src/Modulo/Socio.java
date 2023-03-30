package Modulo;

public class Socio {

    private String nombre;
    private int numeroDeSocio;
    private int cantLibrosLeidos;
    private int cantLibrosEnTenencia;

    public Socio(String nombre, int numeroDeSocio)
    {
        this.nombre=nombre;
        this.numeroDeSocio=numeroDeSocio;
        this.cantLibrosLeidos=0;
        this.cantLibrosEnTenencia = 0;
    }

    public static void devolverLibro(int cantLibrosLeidos, int cantLibrosEnTenencia, int librosADevolver)
    {
        if(cantLibrosEnTenencia >= librosADevolver)
        {
            cantLibrosLeidos+=librosADevolver;
            cantLibrosEnTenencia-=librosADevolver;
        }else if(cantLibrosEnTenencia !=0)
        {
            cantLibrosLeidos += cantLibrosEnTenencia;
            cantLibrosEnTenencia = 0;
        }
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantLibrosLeidos(){
        return cantLibrosLeidos;
    }

    public int getNumeroDeSocio() {
        return numeroDeSocio;
    }

    public int getCantLibrosEnTenencia() {
        return cantLibrosEnTenencia;
    }

    public void setCantLibrosEnTenencia(int cantLibrosEnTenencia) {
        this.cantLibrosEnTenencia = cantLibrosEnTenencia;
    }

    public void setCantLibrosLeidos(int cantLibrosLeidos) {
        this.cantLibrosLeidos = cantLibrosLeidos;
    }
}
