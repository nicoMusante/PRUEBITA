/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lownicjava;

import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author alumnos
 */
public class LowNicJava {
  
  /**
   * @param args the command line arguments
   */
  
public static void main(String[] args) {
  int DF=11;
  int [] tabla2 = new int[DF]; //índices 0..10
  for (int i=0; i<DF; i++)
    tabla2[i]=2*i;
  
  GeneradorAleatorio.iniciar();
  int num = GeneradorAleatorio.generarInt(DF + 1);
  while (num != 11){
    System.out.println (tabla2[num]);
    num = GeneradorAleatorio.generarInt(DF + 1);
  } 
  
}
}

