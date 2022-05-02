/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica5;
import PaqueteLectura.Lector;
/**
 *
 * @author alumnos
 */
public class demoFigura {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    System.out.println ("ingrese el radio: ");
    double Lado1 = Lector.leerInt();
    System.out.println ("ingrese el color de relleno: ");
    String colorRelleno = Lector.leerString();
    System.out.println ("ingrese el color de linea: ");
    String colorLinea = Lector.leerString();
    
    
    Circulo triangulo = new Circulo (Lado1, colorLinea, colorRelleno);
    
    System.out.println (triangulo.toString());
  }
  
}
