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
public class Practica2Ejer4 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    String MensajeOculto = "";
    String [] S1 = new String [6];
    
    int i;
    for (i = 0; i < 6; i++){
      System.out.println ("ingrese una palabra: ");
      S1[i] = Lector.leerString();
      System.out.println ();
    }
    
    for (i = 0; i < 6; i ++)
      MensajeOculto = MensajeOculto + S1[i].charAt(0) ;
    
    System.out.println ();
    System.out.println ("lo que dice el momo es: "+ MensajeOculto);
    
    
    System.out.println("Coscu dice ashee");
  }
  
}
