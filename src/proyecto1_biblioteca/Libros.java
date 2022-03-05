/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_biblioteca;

/**
 *
 * @author ruben
 */
public class Libros {
    String autor,titulo,descripcion,categoria,area;
    int anio_publi,isbn,edicion,copias,disponible,ejemplares,tamano,tipo;
    String[] claves,temas;

    public Libros(int tipo,String autor,int anio_publi, int isbn,String titulo, int edicion,String[] claves,String descripcion, String[] temas,int copias, String categoria, int ejemplares,String area,    int disponible,  int tamano) {
        this.tipo=tipo;
        this.autor = autor;
        this.anio_publi = anio_publi;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.area = area;
        this.isbn = isbn;
        this.edicion = edicion;
        this.copias = copias;
        this.disponible = disponible;
        this.ejemplares = ejemplares;
        this.tamano = tamano;
        this.claves = claves;
        this.temas = temas;
        
    }

    

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setAnio_publi(int anio_publi) {
        this.anio_publi = anio_publi;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void setClaves(String[] claves) {
        this.claves = claves;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getArea() {
        return area;
    }

    public int getAnio_publi() {
        return anio_publi;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getEdicion() {
        return edicion;
    }

    public int getCopias() {
        return copias;
    }

    public int getDisponible() {
        return disponible;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getTamano() {
        return tamano;
    }

    public String[] getClaves() {
        return claves;
    }

    public String[] getTemas() {
        return temas;
    }
    
    
    
}
