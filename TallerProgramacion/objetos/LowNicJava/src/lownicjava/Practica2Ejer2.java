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
public class Practica2Ejer2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    Persona [] V = new Persona [15];
    
    System.out.println("ingrese el nombre: ");
    String nom = Lector.leerString();
    System.out.println ("ingrese el dni: ");
    int dni = Lector.leerInt();
    System.out.println ("ingrese la edad: ");
    int Edad = Lector.leerInt();
    
    int i = 0;
    int M65 = 0;
    int Mdni = 9999999;
    Persona P2 = new Persona ();
    while (i < 15 && Edad != 0){
      if (Edad > 65)
        M65 ++;
      if (dni < Mdni){
        P2.setDNI(dni);
        P2.setEdad(Edad);
        P2.setNombre(nom);
        Mdni = dni;
      }
      
      Persona P = new Persona (nom, dni, Edad);
      V[i] = P;
      i ++;
      
      System.out.println("ingrese el nombre: ");
      nom = Lector.leerString();
      System.out.println ("ingrese el dni: ");
      dni = Lector.leerInt();
      System.out.println ("ingrese la edad: ");
      Edad = Lector.leerInt();
    }
    
    System.out.println ();
    System.out.println ("cantidad de personas mayores de 65: "+ M65);
    
    
    System.out.println ();
    System.out.println ("los datos de la persona con dni minimo son: ");
    System.out.println (P2.toString());
  }
  
}

