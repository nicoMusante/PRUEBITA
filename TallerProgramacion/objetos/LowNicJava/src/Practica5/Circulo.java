/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica5;

/**
 *
 * @author alumnos
 */
public class Circulo extends Figura {
  double radio;
  
  public Circulo (double unRadio, String unColorR, String unColorL){
    super(unColorR, unColorL);
    radio = unRadio;
  }

  public double calcularArea(){
    double aux = Math.PI * Math.pow(getRadio(), 2);
    return aux;
  }
  
  public double calcularPerimetro(){
    double aux = 2 * Math.PI * getRadio();
    return aux;
  }
  
  public String toString(){
    String aux = super.toString()+ "Radio: " + radio;
    return aux;
  }
  
  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }
  
}
