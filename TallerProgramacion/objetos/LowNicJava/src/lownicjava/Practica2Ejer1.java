/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lownicjava;

import PaqueteLectura.Lector;

/**
 *
 * @author alumnos
 */
public class Practica2Ejer1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    System.out.println("ingrese el nombre: ");
    String nom = Lector.leerString();
    System.out.println ("ingrese el dni: ");
    int dni = Lector.leerInt();
    System.out.println ("ingrese la edad: ");
    int Edad = Lector.leerInt();
    
    Persona P = new Persona (nom, dni, Edad);
    
    System.out.println (P.toString());
  }
  
}
