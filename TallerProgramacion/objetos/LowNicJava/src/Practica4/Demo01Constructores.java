/*
Demo que crea objetos Libro invocando a los constructores definidos. Tema 4.
 */
package Practica4;
import PaqueteLectura.Lector;

import tema4.*;

/**
 *
 * @author vsanz
 */
public class Demo01Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println ("ingrese el nombre de autor: ");
        String Nombre = Lector.leerString();
        
        System.out.println ("ingrese una biografia: ");
        String Biografia = Lector.leerString();
        
        System.out.println ("ingrse el origen: ");
        String Origen = Lector.leerString();
        
        Autor autor1 = new Autor (Nombre, Biografia, Origen);
        
        Libro libro1= new  Libro( "Java: A Beginner's Guide",   
                                 "Mcgraw-Hill", 2014,   
                                 autor1, "978-0071809252", 21.72);
        
        System.out.println ("ingrese el nombre de autor: ");
        Nombre = Lector.leerString();
        
        System.out.println ("ingrese una biografia: ");
        Biografia = Lector.leerString();
        
        System.out.println ("ingrse el origen: ");
        Origen = Lector.leerString();
        
        Autor autor2 = new Autor (Nombre, Biografia, Origen);
        
        Libro libro2= new Libro("Practicas del Lenguaje",  
                                autor2,  "978-9501314694",19.95);
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println("Editorial de libro2: " +libro2.getEditorial());
        System.out.println("Año edición de libro2: " +libro2.getAñoEdicion());
        
        System.out.println(libro1.getAutor().toString());
    }
    
}
