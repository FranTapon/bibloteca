package Escuela;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private ArrayList<Libro> librosEnExistencia;
    private ArrayList<Libro> librosPrestados;
    private ArrayList<Socio> socios;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.librosEnExistencia = new ArrayList<Libro>();
        this.librosPrestados = new ArrayList<Libro>();
        this.socios = new ArrayList<Socio>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarLibro(Libro libro) {
        librosEnExistencia.add(libro);
    }

    public void borrarLibro(Libro libro) {
        librosEnExistencia.remove(libro);
        librosPrestados.remove(libro);
    }

    public void agregarSocio(Socio socio) {
        socios.add(socio);
    }

    public void borrarSocio(Socio socio) {
        socios.remove(socio);
    }

    public void prestarLibro(Socio socio, Libro libro) {
        if (librosEnExistencia.contains(libro)) {
            socio.retirarLibro(libro);
            librosEnExistencia.remove(libro);
            librosPrestados.add(libro);
        } else {
            System.out.println("El libro no está disponible en la biblioteca.");
        }
    }

    public void recibirLibro(Socio socio, Libro libro) {
        if (librosPrestados.contains(libro)) {
            socio.devolverLibro(libro);
            librosPrestados.remove(libro);
            librosEnExistencia.add(libro);
        } else {
            System.out.println("El libro no está prestado actualmente.");
        }
    }

    public ArrayList<Libro> getLibrosEnExistencia() {
        return librosEnExistencia;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }
}
