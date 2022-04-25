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
public class Practica1Ejer2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int [] Jugadores = new int [15];
    int i;
    int AP = 0;
    int EP = 0;
    for (i = 0; i < 15; i ++){
      System.out.println("ingrese la altura del jugador "+ i);
      Jugadores [i] = Lector.leerInt();
      AP = AP + Jugadores [i];
    }
    
    AP = AP / 15;
    
    for (i = 1; i < 15; i++)
      if (Jugadores [i] > AP){
        EP ++;
      }
    
    System.out.println ("la altura promedio es: " + AP);
    System.out.println ("la cantidad de juadores por encima del promedio es: " + EP);
  }
  
}
