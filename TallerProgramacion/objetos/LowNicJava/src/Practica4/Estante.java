/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica4;

/**
 *
 * @author alumnos
 */
public class Estante {
  Libro [] vector;
  int dimL;
  
  public Estante (){
    vector = new Libro [20]; 
    dimL = 0;
  }
  
  public void agregarLibro (Libro unLibro){
    getVector()[getDimL()] = unLibro;
    int aux = getDimL ();
    aux ++;
    setDimL (aux);
  }
  
  public Libro getLibro (String unTitulo){
    int i = 0;
    while (i < 20 && !unTitulo .equals (getVector()[i].getTitulo()) )
      i ++;
    if (i < 20)
      return getVector()[i];
    else
      return null;
  }

  public Libro[] getVector() {
    return vector;
  }

  public int getDimL() {
    return dimL;
  }

  public void setDimL(int dimL) {
    this.dimL = dimL;
  }
  
  public int cantidad(){
    int aux = getDimL();
    aux ++;
    return (aux);
  }
  
  public boolean getLleno(){
    return getDimL() == 20;
  }
  
}
