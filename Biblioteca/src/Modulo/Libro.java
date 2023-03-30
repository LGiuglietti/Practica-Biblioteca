package Modulo;

public class Libro {
    private boolean disponibilidad; // true: esta disponible, false=no esta disponible
    private int cantVecesPrestado;

    private String titulo;
    private int cantCopias;

    public Libro(int cantCopias, String titulo)
    {
        this.disponibilidad=true;
        this.cantVecesPrestado=0;
        this.cantCopias= cantCopias;
        this.titulo = titulo;
    }
    public Libro(boolean disponibilidad, int cantVecesPrestado, int cantCopias, String titulo)
    {
        this.disponibilidad=disponibilidad;
        this.cantVecesPrestado=cantVecesPrestado;
        this.cantCopias=cantCopias;
        this.titulo = titulo;
    }

    public boolean prestar(int cantVecesPrestado,int cantCopias)
    {
        boolean disponibilidad = true;
        if(cantCopias != 0)
        {
            cantVecesPrestado++;
            cantCopias--;
        }else
            disponibilidad = false;

        return disponibilidad;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public int getCantCopias()
    {
        return cantCopias;
    }
    public int getCantVecesPrestado()
    {
        return cantVecesPrestado;
    }

    public void setCantCopias(int cantCopias)
    {
        this.cantCopias = cantCopias;
    }
    public void setCantVecesPrestado(int cantVecesPrestado)
    {
        this.cantVecesPrestado = cantVecesPrestado;
    }




}
