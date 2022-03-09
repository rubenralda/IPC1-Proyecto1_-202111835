/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1_biblioteca;

import java.awt.Color;

/**
 *
 * @author ruben
 */
public class Proyecto1_biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuarios[] usuario=new Usuarios[50];
        Libros[] libros= new Libros[50];
        Libros[] pres= new Libros[50];
        usuario[0]=new Usuarios(1,"admin","admin","admin","admin","admin",pres);
        Principal pantalla1= new Principal(usuario,libros);
        pantalla1.setVisible(true);
        pantalla1.getContentPane().setBackground(Color.WHITE);
    }
    
}
