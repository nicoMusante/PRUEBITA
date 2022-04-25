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
public class ejer1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    double lado1, lado2, lado3;
    System.out.println ("ingrese la medida del lado 1: ");
    lado1 = Lector.leerDouble();
    System.out.println ("ingrese la medida del lado 2: ");
    lado2 = Lector.leerDouble();
    System.out.println ("ingrese la medida del lado 3: ");
    lado3 = Lector.leerDouble();
    
    Triangulo triangulo = new Triangulo (lado1, lado2, lado3);
    
    System.out.println (triangulo.getArea());
    
    System.out.println (triangulo.getPerimetro());
  }
}
