/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica4;
import PaqueteLectura.Lector;

/**
 *
 * @author alumnos
 */
public class Ejer3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    System.out.println ("ingrese el nombre del autor: ");
    Autor autor = new Autor (Lector.leerString());
    
    if (!"ian" .equals(autor.getNombre()))
      System.out.println ("ingrese el titulo del libro: ");        
    
    Estante estante = new Estante ();
      
    while (!"ian" .equals(autor.getNombre()) &&  estante.getDimL() < 20){
      Libro libro = new Libro (Lector.leerString(), autor);
      estante.agregarLibro(libro);
      
      System.out.println ("ingrese el nombre del autor: ");
      autor = new Autor (Lector.leerString());
    
      if (!"ian" .equals(autor.getNombre()))
        System.out.println ("ingrese el titulo del libro: ");
    }
      
    
  }
  
