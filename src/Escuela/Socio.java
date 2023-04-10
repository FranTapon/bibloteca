package Escuela;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private int numeroSocio;
    private ArrayList<Libro> librosRetirados;

    public Socio(String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.librosRetirados = new ArrayList<Libro>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void retirarLibro(Libro libro) {
        librosRetirados.add(libro);
    }

    public void devolverLibro(Libro libro) {
        librosRetirados.remove(libro);
    }

    public ArrayList<Libro> getLibrosRetirados() {
        return librosRetirados;
    }

    @Override
    public String toString() {
        return "Socio [nombre=" + nombre + ", numeroSocio=" + numeroSocio + ", librosRetirados=" + librosRetirados + "]";
    }
}
