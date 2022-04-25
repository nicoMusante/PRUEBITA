/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;
import PaqueteLectura.Lector;
/**
 *
 * @author alumnos
 */
public class ejer2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Balanza balanza = new Balanza();
    
    balanza.iniciarCompra();
    
    
    System.out.println ("ingrese el peso del producto: ");
    int peso = Lector.leerInt();
    System.out.println ("ingrese el precio por kilo: ");
    int precio = Lector.leerInt();
    while (peso != 0){
      balanza.registrarProducto(peso, precio);
      
      System.out.println ("ingrese el peso del producto: ");
      peso = Lector.leerInt();
      System.out.println ("ingrese el precio por kilo: ");
      precio = Lector.leerInt();
      
    }
    System.out.println (balanza.getResumenDeCompra());
    
  }
  
}
