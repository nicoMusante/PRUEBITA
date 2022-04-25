/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lownicjava;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

/**
 *
 * @author alumnos
 */
public class Practica1Ejer3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    GeneradorAleatorio.iniciar();
    int [][] m = new int [10][10];
    int[] v = new int [10];
    int i, j;
    int suma=0;
    for(i=0; i<10; i++)
      for(j=0;j<10; j++)
        m[i][j]= GeneradorAleatorio.generarInt(201);
      
    for(i=0; i<10; i++)
      for(j=0;j<10; j++)
        System.out.println(m[i][j]);
    
    for(i=2; i<10; i++)
      for(j=0; j<4; j++)
        suma = suma + m [i][j];
    
    System.out.println("La suma desde la fila 2 hasta la fila 9, y desde la columna 0 hasta la columna 3 en la matris es igual a: "+suma);
    
    for(i=0; i<10; i++ ){
      suma=0;
      for(j=0; j<10; j++)
        suma=suma+m[i][j];
      v[i]=suma;
    }
    
    for(i=0; i<10; i++)
      System.out.println(v[i]);
      
    int num;
    
    System.out.println("Introduzca el numero que desea buscar en la matris: ");
    num=Lector.leerInt();
    int fila=-1, col=-1;
    i=0;
    j=0;
    while(( i<10 )&&(fila==-1)){
      while((j<10)&&(fila==-1)){
        if(m[i][j]==num){
          fila=i;
          col=j;
        }
        j++;}
      i++;
    }
      if(fila!=-1)
        System.out.println("El elemento buscado está en la fila "+fila+", columna "+col);
      else
        System.out.println("No se encontró el elemento");
        
    
  
  
  }
  
    
        
  }
    
}
