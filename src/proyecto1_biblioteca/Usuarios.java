/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_biblioteca;

/**
 *
 * @author ruben
 */
public class Usuarios {
    int dpi;
    String nombre,apellido,user,rol,pass;

    public Usuarios(int dpi, String nombre, String apellido, String user, String rol, String pass) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.rol = rol;
        this.pass = pass;
    }
    
    public int getDpi() {
        return dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUser() {
        return user;
    }

    public String getRol() {
        return rol;
    }

    public String getPass() {
        return pass;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
